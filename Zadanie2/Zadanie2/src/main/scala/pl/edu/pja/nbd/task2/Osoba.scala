package pl.edu.pja.nbd.task2

case class Osoba(imie: String, nazwisko: String) {

}

object Osoba {
  val someOsobas: Array[Osoba] = Array(
    new Osoba("Imie1", "Nazwisko1"),
    new Osoba("Imie2", "Nazwisko2"),
    new Osoba("Imie3", "Nazwisko3"),
    new Osoba("Imie4", "Nazwisko4"),
    new Osoba("Imie5", "Nazwisko5"),
    new Osoba("Imie5", "Nazwisko6"),
  )
}