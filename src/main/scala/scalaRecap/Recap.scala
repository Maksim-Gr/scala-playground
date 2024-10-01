package scalaRecap
import scala.annotation.tailrec

object Recap extends App:
  val aCondition: Boolean = false
  val aConditionVal = if aCondition then 42 else 65

  //instructions vs expressions

  //compiler  infers types
  //result will be the last value in the expression
  val aCodeBlock =
    if aCondition then 54
    56
  //Unit doesn't return anything but create side effects
  val theUnit: Unit = println("Hello, unit")
  //functions
  def aFunctions(x: Int): Int = x + 1
  // tailrec doesn't use additional stack frames
  @tailrec def factorial(n: Int, accumulator: Int): Int =
    if n <= 0 then accumulator
    else factorial(n - 1, n * accumulator)
  // OOP
  class Animal
  class Dog extends Animal

  val aDog: Animal = new Dog // subtyping

  trait Carnivore:
    def eat(a: Animal): Unit

  class Crocodile extends Animal with Carnivore:
    override def eat(a: Animal): Unit = ???

  //method notation
  val aCroc = new Crocodile
  aCroc.eat(aDog)

  aCroc eat aDog

  //anonymous classes
  var aCarnivore = new Carnivore:
    override def eat(a: Animal): Unit = println("sound")

    //Generics
    abstract class MyList[+A] //variance

    object MyList

    //case classes
    case class Person(name: String, age: Int)

    //exceptions try/catch/finally
    val throwsException = throw new RuntimeException // Nothing

    val aPotentialFailure =
      try throw new RuntimeException
      catch case e: Exception => "I caught the exception"
      finally println("some logs")
