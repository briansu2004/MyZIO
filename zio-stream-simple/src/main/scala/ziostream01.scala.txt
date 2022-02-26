import zio._
import zio.console._
import zio.stream._

object ziostream01 extends App {
  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] = {
    val text = "A B A B A "

    Stream
      .repeatEffectWith(ZIO.succeed(text), Schedule.recurs(1))
      .tap(putStrLn(_))
      .transduce(ZTransducer.splitOn(" "))
      .tap(putStrLn(_))
      .groupByKey(identity) { case (word, stream) =>
        stream
          .tap(x => putStrLn("aggStreamBefore " + x))
          .scan((0, word)){case (acc, _) => (acc._1 + 1, word)}
          .tap(x => putStrLn("aggStreamAfter " + x.toString))
      }
      .tap(x => putStrLn(x.toString + "\n"))
      .runCollect
      .flatMap(chunk => putStrLn(chunk.mkString(", ")))
      .exitCode
  }
}
