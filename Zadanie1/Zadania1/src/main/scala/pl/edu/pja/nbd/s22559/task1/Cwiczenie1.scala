package pl.edu.pja.nbd.s22559.task1

class Cwiczenie1() {
  //Cwiczenie 1a
  def printArrayAsStringCommaSeparateForLoop(values: Array[String]): String = {
    val sb = new StringBuilder()
    for (dayOfWeek <- values) {
      sb ++= dayOfWeek
      sb ++= ","
    }

    sb.deleteCharAt(sb.length() - 1)
    sb.toString()
  }

  //Cwiczenie 1b
  def printArrayAsStringCommaSeparateStartsWithPForLoop(values: Array[String]): String = {
    val sb = new StringBuilder()
    for (dayOfWeek <- values if dayOfWeek startsWith "P" ) {
      sb ++= dayOfWeek
      sb ++= ","
    }

    sb.deleteCharAt(sb.length() - 1)
    sb.toString()
  }



  //Cwiczenie 1c
  def printArrayAsStringCommaSeparateWhileLoop(values: Array[String]): String = {
    val sb = new StringBuilder()
    var index = 0
    while(index < values.length) {
      sb ++= values(index)
      sb ++= ","
      index += 1
    }

    sb.deleteCharAt(sb.length() - 1)
    sb.toString()
  }

}

object Cwiczenie1 {
  val daysOfWeek: Array[String] =
    Array[String]("Poniedzialek","Wtorek","Sroda","Czwartek","Piatek","Sobota","Niedziela")
}