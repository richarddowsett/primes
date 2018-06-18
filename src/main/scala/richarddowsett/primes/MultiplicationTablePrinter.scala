package richarddowsett.primes

object MultiplicationTablePrinter {

  def createTable(primes: List[Int]):List[List[String]] = {
    val header = primes.map(_.toString).::(" ")
    val body = primes.map(x => {
      primes.map(y => x * y).map(_.toString).::(x.toString)
    })
    header :: body
  }

  def createFormattedTable(table: List[List[String]]):String = {
    table.map(list => {
      "| " + list.mkString(" | ") + " |"
    }).mkString("\n")
  }


}
