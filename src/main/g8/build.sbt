lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "$name$",
    assemblyJarName in assembly := "$name$.jar",
    mainClass in assembly := Some("$organization$.$name;format="snake"$.Main"),
    test in assembly := {},
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
    addCompilerPlugin(
      ("org.typelevel" %% "kind-projector" % "0.11.3").cross(CrossVersion.full)
    ),
    addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1"),
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.2.3",
      "io.chrisdavenport" %% "log4cats-slf4j" % "1.1.1",
      "org.typelevel" %% "cats-core" % "2.4.2",
      "org.typelevel" %% "cats-effect" % "2.2.0",
      "io.estatico" %% "newtype" % "0.4.4",
      "org.scalatest" %% "scalatest" % "3.2.3" % Test
    )
  )

lazy val commonSettings = Seq(
  scalaVersion := "2.13.3",
  organization := "$organization$",
  version := "0.1.0-SNAPSHOT"
)
