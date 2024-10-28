enablePlugins(ScalaJSPlugin)

scalaVersion := "3.3.4"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "2.8.0"
)

scalaJSUseMainModuleInitializer := true

Compile / fullOptJS / artifactPath := baseDirectory.value / "index.js"
