package pl.edu.pja.nbd.task2

class Cwiczenie1 {

  def daysOfWeekCases(dayOfWeek: String): String = dayOfWeek match {
    case "Poniedzialek" | "Wtorek" | "Sroda" | "Czwartek" | "Piatek" => "Praca"
    case "Sobota" | "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
}

object Cwiczenie1 {
  val testStrings: Array[String] = Array("Wtorek", "Piatek", "Niedziela", "123xyz")
}
