import zio.{Console, _}

object ZIOConsole extends ZIOAppDefault {
  override def run: ZIO[zio.ZEnv with Has[ZIOAppArgs], Any, Any] = {
    val uuid = Random.nextUUID.toString
    for {
      _ <- Console.printLine("Hello! What is your name?")
      //(uuid, username) <- "UUID" zip Console.readLine
      username <- Console.readLine
      _ <- Console.printLine(s"Hello $username, good to meet you! Here is your UUID: $uuid")
    } yield ()
  }
}

