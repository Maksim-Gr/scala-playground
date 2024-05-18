package functionalProgrammingScala
import HighOrderFunctions.factorial

object Factorial:

  private def abs(n: Int): Int =
    if n < 0 then -n
    else n

  private def formatAbs(x: Int) =
    val msg = "The absolute value of %d is the %d"
    msg.format(x, abs(x))

  private def formatFactorial(n: Int) =
    val msg = "The factorial of %d is the %d"
    msg.format(n, factorial(n))

  // f is the function getting the int and returning the int
  private def formatResult(name: String, n: Int, f: Int => Int) =
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))

  @main def printAbsAndFactorial(): Unit =
    formatResult("absolute value", -34, abs)
    formatResult("factorial", 7, factorial)
