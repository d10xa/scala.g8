ThisBuild / scalaVersion := "2.13.0"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "$organization$"

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    assemblyJarName in assembly := "$name$.jar",
    mainClass in assembly := Some("$organization$.$name$.Main"),
    test in assembly := {}
  )

libraryDependencies += "org.typelevel" %% "cats-core" % "$cats_core_version$"
libraryDependencies += "org.typelevel" %% "cats-effect" % "$cats_effect_version$"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "$logback_classic_version$"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "$scala_logging_version$"
libraryDependencies += "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test
