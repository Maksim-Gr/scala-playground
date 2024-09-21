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
