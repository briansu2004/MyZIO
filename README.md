# MyZIO

My ZIO

## ZIO

ZIO is a zero-dependency library for asynchronous and concurrent programming in Scala. It is a functional effect system in Scala.

There are several functional effect systems in functional programming in the Scala community, such as ZIO, Cats Effect, and Monix.

## Functional Effect

The functional effect is about turning the computation into first-class values. Every effect can be thought of as an operation itself, but a functional effect is a description of that operation.

For example, in Scala, the code `println(“Hello, Scala!”)` is an effect that prints the “Hello, Scala!” message to the console. The println function is of type Any => Unit. It returns Unit, so it is a statement.

But in ZIO, `Console.printLine(“Hello, ZIO!”)` is a functional effect of printing “Hello, ZIO!” on the console. It is a description of such an operation. Console.printLine is a function of type Any => ZIO[Any, IOException, Unit]. It returns the ZIO data type, which is the description of printing the message to the console.

So, in a nutshell:

An effect is about doing something, such as println(“Hello, Scala!”)

A functional effect is about the description of doing something, as in zio.Console.printLine(“Hello, ZIO!”)

## sbt ZIO

build.sbt

zio 2.x

```
libraryDependencies += "dev.zio" %% "zio" % "2.0.0-M4"
libraryDependencies += "dev.zio" %% "zio-streams" % "2.0.0-M4"
```

zio 1.x

```
libraryDependencies += "dev.zio" %% "zio" % "1.0.13"
libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.13"
```

```
lazy val zioVersion = "1.0.13"

libraryDependencies ++= Seq(
  "dev.zio"                %% "zio"                     % zioVersion,
  "dev.zio"                %% "zio-streams"             % zioVersion,
  "org.scala-lang.modules" %% "scala-collection-compat" % "2.5.0",
  "dev.zio"                %% "zio-nio"                 % "2.0.0-RC2",
  "dev.zio"                %% "zio-test"                % zioVersion % Test,
  "dev.zio"                %% "zio-test-sbt"            % zioVersion % Test
)
```

## STM (Software Transactional Memory)

## Misc

![](image/README/zio_interop.png)

## 2022-02-26

- ZIO NIO

  A small, unopinionated ZIO interface to NIO

## 2022-02-27

...
