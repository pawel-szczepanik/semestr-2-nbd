package pl.edu.pja.nbd.task1

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

class Cwiczenie8 {
  def removeZeros(integers: List[Integer]): List[Integer] = {
    @tailrec
    def removeZerosTailCall(integersTailRec: List[Integer], result: ListBuffer[Integer]): List[Integer] = {
      if (integersTailRec.isEmpty) result.result()
      else if (integersTailRec.head == 0) removeZerosTailCall(integersTailRec.slice(1, integersTailRec.length), result)
      else removeZerosTailCall(integersTailRec.slice(1, integersTailRec.length), result += integersTailRec.head)
    }
    removeZerosTailCall(integers, ListBuffer.empty)
  }
}

object Cwiczenie8 {
  val integersWithZeros: List[Integer] = List(0, -4, -3, 0, -2, -1, 0, 0, 0, 0, 1, 0, 2, 3, 4, 0)
}
