import sbt._

object Dependencies extends Akka {

  val scribeVersion = "3.8.2"
  val scalatestVersion = "3.2.11"
  val circeVersion = "0.14.1"

  val slf4j = "org.slf4j" % "slf4j-api" % "1.7.36"
  val logbackClassic = "ch.qos.logback" % "logback-classic" % "1.2.11"
  val logbackLogstash = "net.logstash.logback" % "logstash-logback-encoder" % "7.0.1"
  val scribe = "com.outr" %% "scribe" % scribeVersion
  val scribeJson = "com.outr" %% "scribe-json" % scribeVersion
  val scribeSlf4j = "com.outr" %% "scribe-slf4j" % scribeVersion

  //lazy val algolia = "3.14.1"
  //"com.algolia" % "algoliasearch-core" % algolia,
  //"com.algolia" % "algoliasearch-java-net" % algolia,

  val scalaTest = "org.scalatest" %% "scalatest" % scalatestVersion % Test
  val scopt = "com.github.scopt" %% "scopt" % "4.0.1"
  val gcFunctions = "com.google.cloud.functions" % "functions-framework-api" % "1.0.4" % Provided
  val telegramBot = "org.telegram" % "telegrambots" % "5.7.1"
  val sconfig = "org.ekrich" %% "sconfig" % "1.4.9"
  val pureconfig = "com.github.pureconfig" %% "pureconfig" % "0.17.1"
  val jacksonScala = "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.13.2"
  val circeCore = "io.circe" %% "circe-core" % circeVersion
  val circeGeneric = "io.circe" %% "circe-generic" % circeVersion
  val circeParser = "io.circe" %% "circe-parser" % circeVersion
}

trait Akka {

  lazy val akkaVersion = "2.6.18"
  lazy val akkaHttpVersion = "10.2.9"
  lazy val akkaHttpCorsVersion = "1.1.3"
  lazy val akkaGrpcVersion = "2.1.3"
  lazy val akkaManagementVersion = "1.1.3"
  lazy val alpakkaKafkaVersion = "3.0.0"
  lazy val kamonVersion = "2.5.0"

  val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
  val akkaHttpSpray = "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion
  val akkaActorTyped = "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  val akkaDiscovery = "com.typesafe.akka" %% "akka-discovery" % akkaVersion
  val akkaPersistenceTyped = "com.typesafe.akka" %% "akka-persistence-typed" % akkaVersion
  val akkaSerializationJackson = "com.typesafe.akka" %% "akka-serialization-jackson" % akkaVersion
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
  val akkaLevelDBDependency = "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.18.3"
  //val akkaPersistenceCouchbase = "com.lightbend.akka" % "akka-persistence-couchbase" % "1.0"
  val akkaStreamKafka = "com.typesafe.akka" %% "akka-stream-kafka" % alpakkaKafkaVersion
  //"com.typesafe.akka" %% "akka-pki" % akkaVersion,
  val akkaHttpCors = "ch.megard" %% "akka-http-cors" % akkaHttpCorsVersion // Para poder usar akka grpc con grpc-web
  val akkaGrpcRuntime = "com.lightbend.akka.grpc" %% "akka-grpc-runtime" % akkaGrpcVersion
  val akkaManagement =
    "com.lightbend.akka.management" %% "akka-management" % akkaManagementVersion exclude ("com.typesafe.akka", "akka-http")

  val kamonBundle = "io.kamon" %% "kamon-bundle" % kamonVersion
  val kamonApmReporter = "io.kamon" %% "kamon-apm-reporter" % kamonVersion

  val akkaActorTypedTest = "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test
  val akkaStreamTest = "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
  val akkaPersistenceTest = "com.typesafe.akka" %% "akka-persistence-testkit" % akkaVersion % Test
}
