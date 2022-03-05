lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "$name$",
    scalacOptions := Seq(
      "-encoding", "UTF-8", // source files are in UTF-8
      "-deprecation", // warn about use of deprecated APIs
      "-unchecked", // warn about unchecked type parameters
      "-feature", // warn about misused language features
      "-language:higherKinds", // allow higher kinded types without `import scala.language.higherKinds`
      "-Xlint", // enable handy linter warnings
      "-Ymacro-annotations", // enable support for macro annotations, formerly in macro paradise.
      "-Wvalue-discard" // warn when non-Unit expression results are unused.
    ),
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.2.11",
      ("org.typelevel" %% "log4cats-slf4j" % "2.0.1")
        .cross(CrossVersion.for3Use2_13),
      ("org.typelevel" %% "cats-core" % "2.5.0")
        .cross(CrossVersion.for3Use2_13),
      ("org.typelevel" %% "cats-effect" % "3.0.1")
        .cross(CrossVersion.for3Use2_13),
      ("io.estatico" %% "newtype" % "0.4.4")
        .cross(CrossVersion.for3Use2_13),
      ("org.scalatest" %% "scalatest" % "3.2.7" % Test)
        .cross(CrossVersion.for3Use2_13)
    )
  )

lazy val commonSettings = Seq(
  scalaVersion := "2.13.5",
  organization := "$organization$",
  version := "0.1.0-SNAPSHOT"
)
