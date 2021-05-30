package pl.edu.pja.nbd.task1

class Cwiczenie10 {
  def absRangeFromMinusFiveToTwelve(doubles: List[Double]): List[Double] = {
    doubles
      .filter(double => double >= -5)
      .filter(double => double <= 12)
      .map(double => Math.abs(double))
  }
}

object Cwiczenie10 {
  val doubles: List[Double] = List(-216.61235, 7,-4.32467234613246, -5.0, 12.0, 6.654721382173, 1134.682300001371, 0.0198036521069814, 12.713146, -5.61346)
}