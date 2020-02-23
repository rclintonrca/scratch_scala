package Quacks

object QuietQuack extends IQuackStrategy {
  override def quack(): Unit = {
    println("shhhh, i am quacking")
  }
}
