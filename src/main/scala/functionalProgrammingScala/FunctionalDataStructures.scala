package functionalProgrammingScala

object FunctionalDataStructures:
  // +A covariant parameter of List
  enum List[+A]:
    case Nil
    case Cons(head: A, tail: List[A])

  object List:
    // A* means variadic type: can accept 0 or more
    def apply[A](as: A*): List[A] =
      if as.isEmpty then Nil
      else Cons(as.head, apply(as.tail*))

    def sum(ints: List[Int]): Int = ints match
      case Nil         => 0
      case Cons(x, xs) => x + sum(xs)

    def product(doubles: List[Double]): Double = doubles match
      case Nil          => 1.0
      case Cons(0.0, _) => 0.0
      case Cons(x, xs)  => x * product(xs)

    def tail[A](as: List[A]): List[A] = as match
      case Cons(_, t1) => t1
      case Nil         => sys.error("tail of the empty list")

    def drop[A](as: List[A], n: Int): List[A] =
      if n <= 0 then as
      else
        as match
          case Cons(_, t1) => drop(t1, n - 1)
          case Nil         => Nil

    val result = List(5, 10, 3, 4, 5, 6) match
      case Cons(x, Cons(2, Cons(4, _)))          => x
      case Nil                                   => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t)                            => h + sum(t)
      case _                                     => 101

    @main def m(): Unit =
      println(result)
