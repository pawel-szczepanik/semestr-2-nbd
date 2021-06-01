package pl.edu.pja.nbd.task2.cwiczenie5

trait Pracownik extends Osoba {
  var pensja: Double = 1000.00
  override val podatek: Double = 0.2 * pensja
}
