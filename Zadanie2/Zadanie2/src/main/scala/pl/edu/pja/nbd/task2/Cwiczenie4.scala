package pl.edu.pja.nbd.task2

class Cwiczenie4 {

  def function(integer: Int, function: Int => Int): Int = {
    var result = 0
    for (i <- 1 to 3) {
      result += function(integer)
      println("step (" + i + "): " + result)
    }
    result
  }
}
