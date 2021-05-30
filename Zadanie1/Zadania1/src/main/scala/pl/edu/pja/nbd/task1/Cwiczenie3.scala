package pl.edu.pja.nbd.task1

import scala.annotation.tailrec

class Cwiczenie3 {

  def printArrayAsStringCommaSeparateTailCall(values: Array[String]): String = {
    @tailrec
    def tailRec(valuesTailRec: Array[String], result: String): String = {
      val valueLength = valuesTailRec.length
      if (valueLength == 1) result
      else tailRec(valuesTailRec.slice(1, valueLength), result + "," + valuesTailRec(1))
    }
    tailRec(values, values(0))
  }
}
