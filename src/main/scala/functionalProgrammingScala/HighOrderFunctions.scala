package functionalProgrammingScala

import scala.annotation.tailrec

object HighOrderFunctions:
  private def factorial(n: Int): Int =
    @tailrec
    def go(n: Int, acc: Int): Int =
      if n <= 0 then acc
      else go(n - 1, n * acc)

    go(n, 1)

  //Test
  private def fib(n: Int): Int =
    @tailrec
    def go(n: Int, current: Int, next: Int): Int =
    if n <= 0 then current
    else go(n - 1, next, current + next)

    go(n, 0, 1)


  @main def printFibAndFactorial(): Unit =
    println(factorial(23))
    println(fib(123))

