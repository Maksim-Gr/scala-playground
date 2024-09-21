package firstStepsScala

import java.io.File

@main def controlStructure(args: String*): Unit =
  val fileName = if args.nonEmpty then args(0) else "default.txt"

  //scala while types
  val filesHere = (new File(".")).listFiles()
  // generator conde
  for file <- filesHere do println(file)

  // 10 is included in range
  for i <- 1 to 10 do println(s"iteration $i")
  // 5 is excluded from the range
  for i <- 1 until 5 do println(s"iteration $i")

  // filters
  for file <- filesHere if file.getName.endsWith(".sbt") do println(file)

  for file <- filesHere if file.getName.endsWith(".conf") do println(file)

  //nested loops
  def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toArray

  def grep(pattern: String): Unit =
    for
      file <- filesHere if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(pattern)
    do println(s"$file: $trimmed")

  // Creating new collections
  val sbtFiles = for file <- filesHere if file.getName.endsWith(".sbt")
  yield file


