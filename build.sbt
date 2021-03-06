organization := "io.github.gitbucket"
name := "gitbucket-explorer-plugin"
version := "8.0.0"
scalaVersion := "2.13.1"
gitbucketVersion := "4.34.0"

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true
