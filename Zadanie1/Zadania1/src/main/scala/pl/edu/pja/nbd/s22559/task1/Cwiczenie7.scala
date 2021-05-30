package pl.edu.pja.nbd.s22559.task1

import pl.edu.pja.nbd.s22559.task1.Cwiczenie7.capitals

class Cwiczenie7 {
  def getCapital(country: String): Option[String] = capitals get country
}

object Cwiczenie7 {
  val capitals: Map[String, String] = Map(
    "Poland" -> "Warsaw",
    "Canada" -> "Ottawa",
    "Finland" -> "Helsinki",
    "Estonia" -> "Tallinn"
  )
}
