name := "SbtExampleProject"

version := "0.1"

scalaVersion := "2.12.3"
// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.0.0-preview2"
// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.0.0-preview2"
// https://mvnrepository.com/artifact/com.oracle.ojdbc/ojdbc8
libraryDependencies += "com.oracle.ojdbc" % "ojdbc8" % "19.3.0.0"

