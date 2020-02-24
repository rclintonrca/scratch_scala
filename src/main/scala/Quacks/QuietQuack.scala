package Quacks

object QuietQuack extends IQuackStrategy {
  def quack(): Unit = {
    println("shhhh, i am quacking")
  }
}
