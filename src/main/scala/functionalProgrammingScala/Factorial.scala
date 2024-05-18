package functionalProgrammingScala
import HighOrderFunctions.factorial

object Factorial:
  
  private def abs(n:Int):Int =
    if n < 0 then -n
    else n
    
  
  
  private def formatAbs(x: Int) =
    val msg = "The absolute value of %d is the %d"
    msg.format(x, abs(x))
    
  private def formatFactorial(n:Int) =
    val msg = "The factorial of %d is the %d"
    msg.format(n, factorial(n))
  
  @main def printAbsAndFactorial():Unit =
    println(formatAbs(-423))
    println(factorial(4))