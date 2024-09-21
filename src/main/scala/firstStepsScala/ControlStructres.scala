package firstStepsScala

import java.io.File

@main def controlStructure(args: String*): Unit =
  val fileName = if args.nonEmpty then args(0) else "default.txt"

  //scala while types
  val filesHere = (new File(".")).listFiles()
  // generator conde
  for file <- filesHere do println(file)
