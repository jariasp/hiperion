name := """hiperion"""
organization := "happySnacks"
herokuAppName in Compile := "damp-reaches-95220"
version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice
