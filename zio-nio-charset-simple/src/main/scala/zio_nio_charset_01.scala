import zio.nio.charset._
import zio.nio.file._

object zio_nio_charset_01 extends App {
  val s = "Hello, world!"

  for {
    utf16Bytes <- Charset.Standard.utf16.encodeString(s)
    _ <- Files.writeBytes(Path("C:/tmp/utf16.txt"), utf16Bytes)
  } yield ()

  println("Done")
}
