ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.6"

lazy val root = (project in file("."))
  .settings(
    name := "zio-stream-simple"
  )

libraryDependencies += "dev.zio" %% "zio" % "2.0.0-M4"
libraryDependencies += "dev.zio" %% "zio-streams" % "2.0.0-M4"

//libraryDependencies += "dev.zio" %% "zio" % "1.0.0-RC17"
//libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.0-RC17"

//libraryDependencies += "dev.zio" %% "zio" % "1.0.9"
//libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.9"
