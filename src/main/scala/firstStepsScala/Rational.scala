package firstStepsScala

import scala.annotation.{tailrec, targetName}

class Rational(n: Int, d: Int):
  //Check the parameters before the initial constructor
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val number: Int = d / g
  val denom: Int = n / g

  //additional constructor
  def this(n: Int) = this(n, 1)
  override def toString: String = s"$number/$denom"

  @targetName("+")
  def +(that: Rational): Rational =
    Rational(number * that.denom + that.number * denom, denom * that.denom)

  //overload the methods
  @targetName("+")
  def +(i: Int): Rational =
    Rational(number + i * denom, denom)

  @targetName("*")
  def *(that: Rational): Rational =
    Rational(number * that.number, denom * that.number)

  @tailrec
  private def gcd(a: Int, b: Int): Int =
    if b == 0 then a else gcd(b, a % b)

@main def printRational(): Unit =
  val x = Rational(1, 2)
  val y = Rational(2, 7)
  println(x + y)
