package firstStepsScala
import scala.collection.mutable
import scala.collection.mutable.Map
class CheckSumAccumulator:
  private var sum = 0
  // all parameters inside methods are val
  def add(b: Byte): Unit =
    sum += b

  def checkSum(): Int = ~(sum & 0xff) + 1

object CheckSumAccumulator:
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if cache.contains(s) then cache(s)
    else
      val acc = new CheckSumAccumulator
      for c <- s do
        acc.add((c >> 8).toByte)
        acc.add(c.toByte)
      val cs = acc.checkSum()
      cache += (s -> cs)
      cs

object FirstStepsScala extends App:

  @main def m(): Unit =
    println("Hello, world from Scala!!")
