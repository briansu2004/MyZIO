import zio._
import zio.console.putStrLn
import zio.duration.durationInt
import zio.stream._

import java.nio.file.{Files, Paths}

object LogStreamApp extends App {

  def run(args: List[String]): ZIO[ZEnv, Nothing, Int] = {
    //val is = Files.newInputStream(Paths.get(ClassLoader.getSystemResource("prod_log.txt").toURI()))
    val is = Files.newInputStream(Paths.get("C:/tmp/zio_data/prod_log.txt"))

    val theJob = (for {
      streams <- ZStream
        .fromInputStream(is)
        .chunks
        .aggregate(ZSink.utf8DecodeChunk)
        .aggregate(ZSink.splitLines)
        .mapConcatChunk(identity)
        .tap(data => putStrLn(s"> $data"))
        .filter(isErrorWarning)
        .partition(isError, 4)
    } yield streams).use {
      case (leftStream, rightStream) => {
        val errorStream = leftStream
          .mapM(processError(_))
          .schedule(Schedule.fixed(2.second))

        val warningStream = rightStream
          .aggregate(ZSink.collectAllN[String](10))
          .mapM(processWarning(_))

        errorStream.merge(warningStream).runCollect
      }
    }

    theJob.fold(_ => 1, _ => 0)
  }

  def isErrorWarning(data: String) = {
    data.contains("ERROR") || data.contains("WARN")
  }

  def isError(data: String): Boolean = {
    data.contains("ERROR")
  }

  def processError(data: String) = {
    putStrLn(s"process error message: ${data}") *>
      Task.succeed()
  }

  def processWarning(list: List[String]) = {
    putStrLn(s"process warning messages in batch: ${list.length} => $list") *>
      Task.succeed()
  }
}