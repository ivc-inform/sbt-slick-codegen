scalaVersion := "2.12.4"

libraryDependencies += "com.typesafe.slick" %% "slick" % System.getProperty("slick.version")

enablePlugins(CodegenPlugin)

sourceGenerators in Compile += slickCodegen

slickCodegenDatabaseUrl := "jdbc:postgresql://localhost/example"

slickCodegenDatabaseUser := "test"

slickCodegenDatabasePassword := "test"
