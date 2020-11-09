ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "$organization$"

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    assemblyJarName in assembly := "$name$.jar",
    mainClass in assembly := Some("$organization$.$name$.Main"),
    test in assembly := {},
    scalacOptions := Seq(
      "-encoding", "UTF-8", // source files are in UTF-8
      "-deprecation", // warn about use of deprecated APIs
      "-unchecked", // warn about unchecked type parameters
      "-feature", // warn about misused language features
      "-language:higherKinds", // allow higher kinded types without `import scala.language.higherKinds`
      "-Xlint", // enable handy linter warnings
      "-Xfatal-warnings", // turn compiler warnings into errors
      "-Ymacro-annotations" // for @newtype
    )
  )

wartremoverErrors in(Compile, compile) ++= Seq(
  Wart.Any,
  Wart.AnyVal,
  Wart.ArrayEquals,
  Wart.AsInstanceOf,
  Wart.DefaultArguments,
  Wart.EitherProjectionPartial,
  Wart.Enumeration,
  Wart.Equals,
  Wart.ExplicitImplicitTypes,
  Wart.FinalCaseClass,
  Wart.FinalVal,
  Wart.ImplicitConversion,
  Wart.ImplicitParameter,
  Wart.IsInstanceOf,
  Wart.JavaConversions,
  Wart.JavaSerializable,
  Wart.LeakingSealed,
  Wart.MutableDataStructures,
  Wart.NonUnitStatements,
  Wart.Nothing,
  Wart.Null,
  Wart.Option2Iterable,
  Wart.OptionPartial,
  Wart.Overloading,
  Wart.Product,
  Wart.PublicInference,
  Wart.Recursion,
  Wart.Return,
  Wart.Serializable,
  Wart.StringPlusAny,
  Wart.Throw,
  Wart.ToString,
  Wart.TraversableOps,
  Wart.TryPartial,
  Wart.Var,
  Wart.While
)

addCompilerPlugin("org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full)

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
libraryDependencies += "io.estatico" %% "newtype" % "0.4.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % Test
libraryDependencies += "org.typelevel" %% "cats-core" % "2.2.0"
