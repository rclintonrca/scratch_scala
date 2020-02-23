package Flys

object LowFly extends IFlyStrategy {
  override def fly(): Unit = {
    println("I am flying down low")
  }
}
