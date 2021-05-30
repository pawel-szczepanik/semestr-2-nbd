package pl.edu.pja.nbd.s22559.task1

class Cwiczenie2 {

  def printArrayAsStringCommaSeparateRecursion(values: Array[String]): String = {
    val valuesLength = values.length
    if (valuesLength == 1)
      return values(0)

    printArrayAsStringCommaSeparateRecursion(values.slice(0, valuesLength - 1)) + "," + values(valuesLength - 1)
  }

  def printArrayAsStringCommaSeparateFromEndRecursion(values: Array[String]): String = {
    val valuesLength = values.length
    if (valuesLength == 1)
      return values(0)

    values(valuesLength - 1) + "," + printArrayAsStringCommaSeparateFromEndRecursion(values.slice(0, valuesLength - 1))
  }
}
