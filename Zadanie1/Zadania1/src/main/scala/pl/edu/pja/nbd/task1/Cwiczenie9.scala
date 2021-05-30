package pl.edu.pja.nbd.task1

class Cwiczenie9 {
  def incrementAll(integers: List[Integer]): List[Integer] = {
    integers.map(integer => integer + 1)
  }
}

object Cwiczenie9 {
  val integers: List[Integer] = List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
}