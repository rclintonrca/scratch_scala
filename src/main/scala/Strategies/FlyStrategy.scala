package Strategies

object HighFly extends IFlyStrategy {
  def fly(): Unit = {
    println("I AM FLYING HIGH HIGH HIGH")
  }
}

object LowFly extends IFlyStrategy {
  def fly(): Unit = {
    println("I am flying down low")
  }
}

object NoFly extends IFlyStrategy {
  def fly(): Unit = {
    println("I dont fly")
  }
}
