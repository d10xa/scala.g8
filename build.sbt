// This build is for this Giter8 template.
// To test the template run `g8` or `g8Test` from the sbt session.
// See http://www.foundweekends.org/giter8/testing.html#Using+the+Giter8Plugin for more details.
lazy val root = (project in file("."))
  .enablePlugins(ScriptedPlugin)
  .settings(
    name := "scala.g8",
    Test / test := {
      val _ = (Test / g8Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
  )

// <for_scala_steward issue="https://github.com/fthomas/scala-steward/issues/1286">
libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  ("org.typelevel" %% "log4cats-slf4j" % "2.0.1")
    .cross(CrossVersion.for3Use2_13),
  ("org.typelevel" %% "cats-core" % "2.6.0")
    .cross(CrossVersion.for3Use2_13),
  ("org.typelevel" %% "cats-effect" % "3.0.1")
    .cross(CrossVersion.for3Use2_13),
  ("io.estatico" %% "newtype" % "0.4.4")
    .cross(CrossVersion.for3Use2_13),
  ("org.scalatest" %% "scalatest" % "3.2.7" % Test)
    .cross(CrossVersion.for3Use2_13)
)
// </for_scala_steward>
