package richarddowsett.primes

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer
import scala.math.BigInt

object Primes {


  def isPrime(input: BigInt): Boolean = {
    @tailrec
    def recurse(input: BigInt, list: List[BigInt]): Boolean = {
      list match {
        case Nil => true
        case x :: xs => if (input % x == 0) false
        else recurse(input, xs)
      }
    }

    recurse(input, (BigInt(2) until input).toList)
  }

  def nextPrime(input: BigInt): BigInt = {
    def recurse(i: BigInt): BigInt = {
      if (isPrime(i))
        i
      else
        recurse(i + 1)
    }

    recurse(input + 1)
  }

  lazy val primes: Stream[BigInt] = {
    def loop(v: BigInt): Stream[BigInt] = v #:: loop(nextPrime(v))

    loop(2)
  }

  def nPrimes(n:Int) = primes.take(n).toList

}
