name := "pureconfig-training"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "com.github.pureconfig"   %%  "pureconfig"      % "0.10.2",
  "org.scalatest"           %   "scalatest_2.12"  % "3.0.5"     % "test"
)
