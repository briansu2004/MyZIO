import zio._

import scala.io.StdIn

object ZIOSequential extends ZIOAppDefault {
  override def run: ZIO[zio.ZEnv with Has[ZIOAppArgs], Any, Any] = {
//    val readLine = ZIO.effect(StdIn.readLine())
//    def printLine(line: String) = ZIO.effect(println(line))
//
//    // execute readLine, then pass its result to printLine.
//    // flatMap can be read like “and then do Expression2 with
//    // the result of Expression1”:
//    readLine.flatMap(line => printLine(line))


//    for {
//      line <- readLine
//      _    <- printLine(line)
//    } yield ()

    val firstName = ZIO.effect(StdIn.readLine("..."))
    val lastName = ZIO.effect(StdIn.readLine("..."))
    val fullName = firstName.zipWith(lastName)((first, last) => s"$first $last")

    //def printLine(line: ZIO[Any, Throwable, String]) = ZIO.effect(println(line))
    //def printLine(line: String) = ZIO.effect(println(line))

    //printLine(fullName)
    fullName
  }
}