package functionalProgrammingScala

import scala.annotation.tailrec

object HighOrderFunctions:
  def factorial(n: Int): Int =
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

  //Example of polymorphic functions
  private def findFirst[A](as: Array[A], p:A => Boolean): Int =
    @tailrec
    def loop(n: Int): Int =
      if n >= as.length then -1
      else if p(as(n))  then n
      else loop(n + 1)
    loop(0)

  @main def printFibAndFactorial(): Unit =
    println(factorial(23))
    println(fib(123))
    // The syntax (x: Int) => x == 9 is a function literal, or anonymous function.
    println(findFirst(Array(2, 4, 43, 55), (x:Int) => x == 9))
