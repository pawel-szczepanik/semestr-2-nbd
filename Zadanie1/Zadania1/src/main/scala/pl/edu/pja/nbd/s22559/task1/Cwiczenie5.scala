package pl.edu.pja.nbd.s22559.task1

class Cwiczenie5 {

  def tenPercentOff(productMap: Map[String, Double]): Map[String, Double] = {
    productMap.transform((key, value) => value * 0.9)
  }
}

object Cwiczenie5 {
  /**
   * key -> product name
   * value -> price
   */
  val productMap = Map(
    "product1" -> 10.00,
    "product2" -> 20.00,
    "product3" -> 30.00,
    "product4" -> 40.00,
    "product5" -> 50.00,
    "product6" -> 60.00,
    "product7" -> 70.00,
    "product8" -> 80.00
  )
}