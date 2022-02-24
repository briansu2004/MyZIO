
import zio._
import java.io.IOException

object ZIOHelloWorld extends ZIOAppDefault {
  val myApp: ZIO[Has[Console], IOException, Unit] =
    Console.printLine("Hello, World!")

  def run = myApp
}