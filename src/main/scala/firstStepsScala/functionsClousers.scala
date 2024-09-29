package firstStepsScala

@main def functionClousers(): Unit =
  //clousere example with inner function
  def padLines(text: String, minWidth: Int): String =

    def padLine(line: String): String =
      if line.length >= minWidth then line
      else line + " " * (minWidth - line.length)

    val paddedLines =
      for line <- text.linesIterator yield padLine(line)
    paddedLines.mkString("\n")

  //functional literals
  val increaseValues = (x: Int) => x + 1

  // best practices
  val someNumbers = List(1, 2, 34, 4)
  someNumbers.foreach((x: Int) => println(x))
  // can omit types
  someNumbers.foreach(x => println(x))
  val result = someNumbers.filter(_ > 0)
