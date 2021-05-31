package pl.edu.pja.nbd.task2

class KontoBankowe(private var stanKonta: Double = 0.0) {

  def getStanKonta: Double = stanKonta

  def wplata(kwota: Double): Unit = {
    if (kwota > 0) this.stanKonta += kwota
  }

  def wyplata(kwota: Double): Double = {
    if (this.stanKonta - kwota < 0) {
      val wyplata = this.stanKonta
      this.stanKonta = 0
      wyplata
    } else {
      this.stanKonta -= kwota
      kwota
    }
  }
}
