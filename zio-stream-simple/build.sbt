ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.6"

lazy val root = (project in file("."))
  .settings(
    name := "zio-stream-simple"
  )

//libraryDependencies += "dev.zio" %% "zio" % "2.0.0-M4"
//libraryDependencies += "dev.zio" %% "zio-streams" % "2.0.0-M4"

//libraryDependencies += "dev.zio" %% "zio" % "1.0.0-RC17"
//libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.0-RC17"

//libraryDependencies += "dev.zio" %% "zio" % "1.0.9"
//libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.9"


//val zioVersion = "1.0.13"
//
//libraryDependencies ++= Seq(
//  "dev.zio"                %% "zio"                     % zioVersion,
//  "dev.zio"                %% "zio-streams"             % zioVersion,
//  "org.scala-lang.modules" %% "scala-collection-compat" % "2.5.0",
//  "dev.zio"                %% "zio-nio"                 % "2.0.0-RC2",
//  "dev.zio"                %% "zio-test"                % zioVersion % Test,
//  "dev.zio"                %% "zio-test-sbt"            % zioVersion % Test
//)

//scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "1.0.0-RC17",
  "dev.zio" %% "zio-streams" % "1.0.0-RC17",
  "com.propensive" %% "magnolia" % "0.12.6"
)
