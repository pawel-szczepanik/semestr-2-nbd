package pl.edu.pja.nbd.task2

object Main extends App {

  println("============Cwiczenie 1============")
  val testStrings = Cwiczenie1.testStrings
  val cwiczenie1 = new Cwiczenie1

  testStrings.foreach(string => println("string in: " + string + "; out: " + cwiczenie1.daysOfWeekCases(string)))
  println("===================================")
}
