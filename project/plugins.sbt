addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3-SNAPSHOT")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
