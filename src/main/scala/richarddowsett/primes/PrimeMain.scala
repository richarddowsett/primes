package richarddowsett.primes

object PrimeMain extends App {

  val n = if(args.length == 0) 10 else args(0).toInt

  val primes = Primes.nPrimes(n)
  val table = MultiplicationTablePrinter.createTable(primes)
  println(MultiplicationTablePrinter.createFormattedTable(table))
}
