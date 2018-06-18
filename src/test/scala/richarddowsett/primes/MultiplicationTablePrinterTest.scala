package richarddowsett.primes

import org.junit.runner.RunWith
import org.scalatest.{Matchers, WordSpec}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MultiplicationTablePrinterTest extends WordSpec with Matchers{

  "Multiplication Table" should {
    "be constructed" in {
      val result = MultiplicationTablePrinter.createTable(List(2,3,5))
      result should have size 4
      result(0) shouldEqual List(" ", "2", "3", "5")
      result(1) shouldEqual List("2", "4", "6", "10")
      result(2) shouldEqual List("3", "6", "9", "15")
      result(3) shouldEqual List("5", "10", "15", "25")
    }

    "be have a table format" in {
      val input = MultiplicationTablePrinter.createTable(List(2,3,5))
      val result = MultiplicationTablePrinter.createFormattedTable(input)
      println(result)
      result shouldEqual
        """|   | 2 | 3 | 5 |
           ^| 2 | 4 | 6 | 10 |
           ^| 3 | 6 | 9 | 15 |
           ^| 5 | 10 | 15 | 25 |""".stripMargin('^')
    }
  }


}
