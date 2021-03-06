addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.19")

addSbtPlugin("pl.project13.scala" % "sbt-jmh"         % "0.2.21")
addSbtPlugin("io.spray"           % "sbt-boilerplate" % "0.6.0")
addSbtPlugin("org.tpolecat"       % "tut-plugin"      % "0.4.8")
addSbtPlugin("com.geirsson"       % "sbt-scalafmt"    % "0.5.5")

addSbtPlugin(
  "com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "1.0.0")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")
addSbtPlugin("com.jsuereth"   % "sbt-pgp"      % "1.0.0")

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.10")

addSbtPlugin(
  "com.thesamet" % "sbt-protoc" % "0.99.11" exclude ("com.trueaccord.scalapb", "protoc-bridge_2.10"))

libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin-shaded" % "0.6.0"

addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.2.0")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.3.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.5.2")
addSbtPlugin("com.eed3si9n" % "sbt-doge" % "0.1.5")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15")
