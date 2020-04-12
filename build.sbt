name := "cats-circuit-breaker"

version := "1.0"

scalaVersion := "2.13.1"

crossScalaVersions := Seq("2.11.12", "2.12.8")

organization in ThisBuild := "com.github.spread0x"

publishArtifact in Test := false


libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.0.0",
  "org.typelevel" %% "cats-effect" % "2.0.0",
  "org.scalatest" %% "scalatest" % "3.1.1",
  "co.fs2" %% "fs2-core" % "2.1.0"
)

homepage := Some(url("https://github.com/ayushworks/pariksha"))

scmInfo := Some(ScmInfo(url("https://github.com/ayushworks/pariksha"), "scm:git:git@github.com:ayushworks/pariksha.git"))

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

pomExtra := (
  <developers>
    <developer>
      <id>ayushworks</id>
      <name>ayush</name>
      <url>http://github.com/ayushworks</url>
    </developer>
  </developers>
  )
