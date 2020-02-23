package Quacks

object LoudQuack extends IQuackStrategy {
  override def quack(): Unit = {
    println("HEYYYYYYY I AM QUACKING")
  }
}
