package firstStepsScala

class Rational(n: Int, d: Int):
  //Check the parameters before the initial constructor
  require(d != 0)
  val number: Int = d
  val denom: Int = n

  //additional constructor
  def this(n:Int) = this(n,1)
  override def toString: String = s"$number/$denom"

  def add(that: Rational): Rational =
    Rational(number * that.denom + that.number * denom, denom * that.denom)
