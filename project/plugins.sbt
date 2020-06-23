addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.12.0")
libraryDependencies += { "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value }

// <for_scala_steward issue="https://github.com/fthomas/scala-steward/issues/1286">
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0")
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.9")
// </for_scala_steward>
