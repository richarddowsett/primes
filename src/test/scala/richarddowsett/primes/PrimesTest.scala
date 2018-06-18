package richarddowsett.primes

import org.junit.runner.RunWith
import org.scalatest.{Matchers, WordSpec}
import org.scalatest.junit.JUnitRunner

import richarddowsett.primes.Primes

@RunWith(classOf[JUnitRunner])
class PrimesTest extends WordSpec with Matchers{

  "Primes" should {
    "return first 5 primes" in {
      Primes.nPrimes(5) shouldEqual List(2,3,5,7,11)
    }

    "return next prime number" in {
      Primes.nextPrime(11) shouldEqual 13
    }
  }

}
