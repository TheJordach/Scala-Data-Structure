name := "Data Structure in Scala"


version := "1.0"


scalaVersion := "2.13.12"

resolvers ++=Seq(
"sonatype Repository" at "https://oss.sonatype.org/content/repositories/releases/",
"Central Repository" at "https://repo1.maven.org/maven2/",
"Hortonworks Repository" at "https://repo.hortonworks.com/content/repositories/releases/",
"Atlansian Repository" at "https://packages.atlassian.com/mvn/maven-atlassian-external/",
"Cibo Repository" at "https://dl.bintray.com/cibotech/public/",
)

libraryDependencies ++=Seq(

// Unit Test libraries
"org.specs2" %% "specs2-core" % "4.20.2" % Test,
"org.specs2" %% "specs2-mock" % "4.20.2" % Test,
"org.scalatest" %% "scalatest" % "3.3.0-SNAP4" % Test,

/* Data analyisis Librairies
 *** Breez-viz --> visualization tools
*/
"org.scalanlp" %% "breeze" % "2.1.0",
"org.scalanlp" %% "breeze-viz" % "2.1.0",


/* Data Visualization librairies
 *** "com.cibo" %% "evilplot" % "0.8.0", - Doesn't work ?
*/
"org.plotly-scala" %% "plotly-render" % "0.8.4",
"org.plotly-scala" %% "plotly-core" % "0.8.4",
"org.plotly-scala" %% "kaleido" % "0.1.0",


/* Machine Learning Libraries
 *** Deeplearning4j --> NLP
 *** Opendaylight --> Statistics
 *** Apache Spark --> ML
*/
"org.apache.spark" %% "spark-mllib" % "3.4.1" % "provided",
"org.deeplearning4j" % "deeplearning4j-nlp" % "1.0.0-M2.1",
// Statistics
"org.opendaylight.openflowplugin.model" % "model-flow-statistics" % "0.16.2",
)







