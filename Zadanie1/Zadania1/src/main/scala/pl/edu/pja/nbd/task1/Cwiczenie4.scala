package pl.edu.pja.nbd.task1

class Cwiczenie4 {

  //Cwiczenie 4a
  def printArrayAsStringCommaSeparateFoldLeft(values: Array[String]): String = {
    values.foldLeft("")((result, nextVal) => {
      if (result.isEmpty) nextVal
      else result + "," + nextVal
    })
  }

  //Cwiczenie 4a
  def printArrayAsStringCommaSeparateFoldRight(values: Array[String]): String = {
    values.foldRight("")((nextVal, result) => {
      if (result.isEmpty) nextVal
      else nextVal + "," + result
    })
  }

  //Cwiczenie 4c
  def printArrayAsStringCommaSeparateStartWithPFoldLeft(values: Array[String]): String = {
    values.foldLeft("")((result, nextVal) => {
      if (nextVal.startsWith("P")) {
        if (result.isEmpty) nextVal
        else result + "," + nextVal
      } else result
    })
  }
}
