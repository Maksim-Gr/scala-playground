package firstStepsScala


// Using case classes tells compiler to add apply/toString/hash/equals methods
case class CaseClassExample (name: String, age: Int)

@main def m():Unit =
  val value = CaseClassExample("randomName", 23)
