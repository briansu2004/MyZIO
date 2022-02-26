ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "zio-nio-charset-simple"
  )

//libraryDependencies += "dev.zio" %% "zio" % "1.0.13"
//libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.13"

lazy val zioVersion = "1.0.13"

libraryDependencies ++= Seq(
  "dev.zio"                %% "zio"                     % zioVersion,
  "dev.zio"                %% "zio-streams"             % zioVersion,
  //"dev.zio"                %% "zio-blocking"            % zioVersion,
  "org.scala-lang.modules" %% "scala-collection-compat" % "2.5.0",
  "dev.zio"                %% "zio-nio"                 % "2.0.0-RC2",
  "dev.zio"                %% "zio-test"                % zioVersion % Test,
  "dev.zio"                %% "zio-test-sbt"            % zioVersion % Test
)