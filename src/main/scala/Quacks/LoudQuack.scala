package Quacks

object LoudQuack extends IQuackStrategy {
  def quack(): Unit = {
    println("HEYYYYYYY I AM QUACKING")
  }
}
