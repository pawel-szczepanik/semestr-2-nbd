package pl.edu.pja.nbd.task2.cwiczenie5

trait Nauczyciel extends Pracownik {
  override val podatek: Double = 0.1 * pensja
}
