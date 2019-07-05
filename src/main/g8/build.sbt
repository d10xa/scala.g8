ThisBuild / scalaVersion     := "2.13.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization := "$organization$"

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    assemblyJarName in assembly := "$name$.jar",
    mainClass in assembly := Some("$organization$.$name$.Main"),
    test in assembly := {}
  )

libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0-M4"
libraryDependencies += "org.typelevel" %% "cats-effect" % "2.0.0-M4"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0-SNAP13" % Test
