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

  println("===================================")

  println()

  println("============Cwiczenie 6============")

  println("===================================")

  println()

  println("============Cwiczenie 7============")

  println("===================================")

  println()

  println("============Cwiczenie 8============")

  println("===================================")

  println()

  println("============Cwiczenie 9============")

  println("===================================")

  println()

  println("============Cwiczenie 10============")

  println("====================================")

}
