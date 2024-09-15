package firstStepsScala

@main def controlStructure(args: String*): Unit =
  val fileName = if args.nonEmpty then args(0) else "default.txt"
