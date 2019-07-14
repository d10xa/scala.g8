ThisBuild / scalaVersion := "2.13.0"
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
      "-Xfatal-warnings" // turn compiler warnings into errors
    )
  )

libraryDependencies += "ch.qos.logback" % "logback-classic" % "$logback_classic_version$"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "$scala_logging_version$"
libraryDependencies += "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test
