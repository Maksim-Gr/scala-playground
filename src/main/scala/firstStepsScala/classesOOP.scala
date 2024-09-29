package firstStepsScala

abstract class Element:
  def content: Vector[String]
  def height: Int = content.length
  def width: Int = if height == 0 then 0 else content(0).length

// Private methods and  vals are not extended by child classes
// val defines parameter and a field
class VectorElement(val content: Vector[String]) extends Element

class LineElement(s: String) extends VectorElement(Vector(s)):
  override def width = s.length
  override def height = 1
