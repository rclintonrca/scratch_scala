package Strategies

object LoudQuack extends IQuackStrategy {
  def quack(): Unit = {
    println("HEYYYYYYY I AM QUACKING")
  }
}

object QuietQuack extends IQuackStrategy {
  def quack(): Unit = {
    println("shhhh, i am quacking")
  }
}
