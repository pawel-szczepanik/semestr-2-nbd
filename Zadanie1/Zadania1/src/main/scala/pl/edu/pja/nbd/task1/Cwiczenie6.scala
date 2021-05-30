package pl.edu.pja.nbd.task1

class Cwiczenie6 {
  def printTuple(tuple: (String, Double, List[String])): Unit =
    println("bike name: " + tuple._1 + "; price: " + tuple._2 + "; parts: " + tuple._3.toString())
}

object Cwiczenie6 {
  val tuple: (String, Double, List[String]) = ("bicycle", 2500.00, List("bicycle frame", "bicycle frame"))
}
