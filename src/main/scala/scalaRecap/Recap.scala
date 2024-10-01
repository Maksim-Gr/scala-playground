package scalaRecap
import scala.annotation.tailrec

object Recap extends App{
  val aCondition: Boolean = false
  val aConditionVal = if (aCondition) 42 else 65

  //instructions vs expressions

  //compiler  infers types
  //result will be the last value in the expression
  val aCodeBlock = {
    if(aCondition) 54
    56
  }
  //Unit doesn't return anything but create side effects
  val theUnit = println("Hello, unit")
  //functions
  def aFunctions(x: Int):Int = x + 1
  // tailrec doesn't use additional stack frames
  @tailrec def factorial(n: Int, accumulator: Int): Int =
    if (n <= 0) accumulator
    else factorial(n -1, n *accumulator)
  // OOP
  class Animal
  class Dog extends Animal

  val aDog: Animal = new Dog // subtyping

  trait Carnivore {
    def eat(a: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override def eat(a: Animal): Unit = ???
  }
}
