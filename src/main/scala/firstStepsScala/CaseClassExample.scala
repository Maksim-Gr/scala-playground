package firstStepsScala

// Using case classes tells compiler to add apply/toString/hash/equals methods
case class CaseClassExample(name: String, age: Int):
  def appendToName(suffix: String): CaseClassExample =
    CaseClassExample(s"$name$suffix", age)

object CaseClassExample:
  def apply(name: String, age: Int): CaseClassExample =
    val capitalizedName =
      if !name.isEmpty then
        val firsChar = name.charAt(0).toUpper
        var restOfName = name.substring(1)
        s"$firsChar$restOfName"
      else throw new IllegalArgumentException("Empty name")
    new CaseClassExample(capitalizedName, age)

@main def printCaseClass(): Unit =
  val value = CaseClassExample("randomName", 23)
