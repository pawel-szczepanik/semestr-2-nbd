package pl.edu.pja.nbd.s22559.task1

object Main extends App {

  val daysOfWeek = Cwiczenie1.daysOfWeek

  println("============Cwiczenie 1============")
  val cwiczenie1 = new Cwiczenie1
  //Cwiczenie 1a
  println("1a: " + cwiczenie1.printArrayAsStringCommaSeparateForLoop(daysOfWeek))
  //Cwiczenie 1b
  println("1b: " + cwiczenie1.printArrayAsStringCommaSeparateStartsWithPForLoop(daysOfWeek))
  //Cwiczenie 1c
  println("1c: " + cwiczenie1.printArrayAsStringCommaSeparateWhileLoop(daysOfWeek))
  println("===================================")

  println()

  println("============Cwiczenie 2============")
  val cwiczenie2 = new Cwiczenie2
  //Cwiczenie 2a
  println("2a: " + cwiczenie2.printArrayAsStringCommaSeparateRecursion(daysOfWeek))
  //Cwiczenie 2b
  println("2b: " + cwiczenie2.printArrayAsStringCommaSeparateFromEndRecursion(daysOfWeek))
  println("===================================")

  println()

  println("============Cwiczenie 3============")
  val cwiczenie3 = new Cwiczenie3
  println("3: " + cwiczenie3.printArrayAsStringCommaSeparateTailCall(daysOfWeek))
  println("===================================")

  println()

  println("============Cwiczenie 4============")
  val cwiczenie4 = new Cwiczenie4
  //Cwiczenie 4a
  println("4a: " + cwiczenie4.printArrayAsStringCommaSeparateFoldLeft(daysOfWeek))
  //Cwiczenie 4b
  println("4b: " + cwiczenie4.printArrayAsStringCommaSeparateFoldRight(daysOfWeek))
  //Cwiczenie 4c
  println("4c: " + cwiczenie4.printArrayAsStringCommaSeparateStartWithPFoldLeft(daysOfWeek))
  println("===================================")

  println()

  println("============Cwiczenie 5============")
  val productMap = Cwiczenie5.productMap
  val cwiczenie5 = new Cwiczenie5()

  println("productMap (before discount): " + productMap)
  println("productTenPercentOffMap: " + cwiczenie5.tenPercentOff(productMap))
  println("productMap (after discount): " + productMap)
  println("===================================")

  println()

  println("============Cwiczenie 6============")
  val tuple = Cwiczenie6.tuple
  val cwiczenie6 = new Cwiczenie6()

  println("print tuple:")
  cwiczenie6 printTuple tuple
  println("===================================")

  println()

  println("============Cwiczenie 7============")
  val capitals = Cwiczenie7.capitals
  val cwiczenie7 = new Cwiczenie7()

  println("capitals: " + capitals)
  //exists in capitals
  private val capitalOfEstonia: Option[String] = cwiczenie7.getCapital("Estonia")
  println("The capital of Estonia: " + capitalOfEstonia + " (" + (if (capitalOfEstonia.nonEmpty) "exists" else "not exist") + ")")
  //not exist in capitals
  private val capitalOfLatvia: Option[String] = cwiczenie7.getCapital("Latvia")
  println("The capital of Latvia: " + capitalOfLatvia + " (" + (if (capitalOfLatvia.nonEmpty) "exists" else "not exist") + ")")
  println("===================================")

  println()

  println("============Cwiczenie 8============")
  val integersWithZeros = Cwiczenie8.integersWithZeros
  val cwiczenie8 = new Cwiczenie8()

  println("integersWithZeros: " + integersWithZeros)
  println("integersWithoutZeros: " + cwiczenie8.removeZeros(integersWithZeros))
  println("===================================")

  println()

  println("============Cwiczenie 9============")
  val integers = Cwiczenie9.integers
  val cwiczenie9 = new Cwiczenie9()

  println("integers: " + integers)
  println("incrementIntegers: " + cwiczenie9.incrementAll(integers))
  println("===================================")

  println()

  println("============Cwiczenie 10============")

  println("====================================")

}
