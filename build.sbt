name := "sb-questionario"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc41"
)     

play.Project.playJavaSettings
