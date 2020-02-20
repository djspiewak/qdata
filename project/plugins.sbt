resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.bintrayIvyRepo("slamdata-inc", "sbt-plugins")

addSbtPlugin("com.eed3si9n"  % "sbt-assembly" % "0.14.10")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin("com.slamdata" % "sbt-slamdata" % "5.4.0-da78d34")
