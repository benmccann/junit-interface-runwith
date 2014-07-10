name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs,
  "org.springframework" % "spring-aop"        % "3.2.2.RELEASE",
  "org.springframework" % "spring-context"    % "3.2.2.RELEASE",
  "org.springframework" % "spring-expression" % "3.2.2.RELEASE",
  "org.springframework" % "spring-jdbc"       % "3.2.2.RELEASE",
  "org.springframework" % "spring-orm"        % "3.2.2.RELEASE",
  "org.springframework" % "spring-tx"         % "3.2.2.RELEASE",
  "org.springframework" % "spring-test"       % "3.2.2.RELEASE" % "test"
)
