package pl.edu.pja.nbd.task1

class Cwiczenie2 {

  //Cwiczenie 2a
  def printArrayAsStringCommaSeparateRecursion(values: Array[String]): String = {
    val valuesLength = values.length
    if (valuesLength == 1) values(0)
    else
      printArrayAsStringCommaSeparateRecursion(values.slice(0, valuesLength - 1)) + "," + values(valuesLength - 1)
  }

  //Cwiczenie2b
  def printArrayAsStringCommaSeparateFromEndRecursion(values: Array[String]): String = {
    val valuesLength = values.length
    if (valuesLength == 1) values(0)
    else
      values(valuesLength - 1) + "," + printArrayAsStringCommaSeparateFromEndRecursion(values.slice(0, valuesLength - 1))
  }
}
