ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "zio-helloworld"
  )

libraryDependencies += "dev.zio" %% "zio" % "2.0.0-M4"
libraryDependencies += "dev.zio" %% "zio-streams" % "2.0.0-M4"
