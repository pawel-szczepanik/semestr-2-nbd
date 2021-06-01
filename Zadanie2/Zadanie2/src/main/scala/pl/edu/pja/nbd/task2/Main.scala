package pl.edu.pja.nbd.task2

object Main extends App {

  println("============Cwiczenie 1============")
  val testStrings = Cwiczenie1.testStrings
  val cwiczenie1 = new Cwiczenie1

  testStrings.foreach(string => println("string in: " + string + "; out: " + cwiczenie1.daysOfWeekCases(string)))
  println("===================================")

  println()

  println("============Cwiczenie 2============")
  val kontoBankowe1 = new KontoBankowe(300.00)
  val kontoBankowe2 = new KontoBankowe()

  //stanKonta
  println("kontoBankowe1 (stan poczatkowy): " + kontoBankowe1.getStanKonta)
  println("kontoBankowe2 (stan poczatkowy): " + kontoBankowe2.getStanKonta)

  //wplata
  kontoBankowe1.wplata(500.00)
  kontoBankowe2.wplata(300.00)
  println("kontoBankowe1 (wplata 500.00): " + kontoBankowe1.getStanKonta)
  println("kontoBankowe2 (wplata 300.00): " + kontoBankowe2.getStanKonta)

  //wyplata
  kontoBankowe1.wyplata(650.00)
  kontoBankowe2.wyplata(650.00)
  println("kontoBankowe1 (wyplata 650.00): " + kontoBankowe1.getStanKonta)
  println("kontoBankowe2 (wyplata 650.00): " + kontoBankowe2.getStanKonta + " | wyplacono najwiecej ile mozna bylo nie przekraczajac wartosc 0")

  //proba wplaty -150.00
  kontoBankowe1.wplata(-150.00)
  println("kontoBankowe1 (wplata -150.00): " + kontoBankowe1.getStanKonta + " | proba wplaty kwoty mniejszej niz rownej 0 skutkuje brakiem jakiejkowiek czynnosci")
  println("===================================")

  println()

  println("============Cwiczenie 3============")
  val someOsobas = Osoba.someOsobas

  def greeting(osoba: Osoba): String = osoba match {
    case Osoba("Imie1", nazwisko) => s"Czesc Imie1 $nazwisko"
    case Osoba(imie, "Nazwisko3") => s"Siemaneczko $imie Nazwisko3"
    case Osoba("Imie5", "Nazwisko5") => s"Dzien Dobry Imie5 Nazwisko5"
    case Osoba("Imie5", nazwisko) => s"Jak leci Imie5 $nazwisko?"
    case Osoba(imie, nazwisko) => s"Moje uszanowanie $imie $nazwisko"
  }

  someOsobas.foreach(osoba => println(greeting(osoba)))
  println("===================================")

  println()

  println("============Cwiczenie 4============")
  val cwiczenie4 = new Cwiczenie4

  val initialInteger: Int = 5
  val integerFunction = (x: Int) => x + x
  println("initialInteger: " + initialInteger)
  val result = cwiczenie4.function(initialInteger, integerFunction)
  println("result: " + result)
  println("===================================")

  println()

  println("============Cwiczenie 5============")

  println("===================================")
}
