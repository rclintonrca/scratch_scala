package Flys

object NoFly extends IFlyStrategy {
  def fly(): Unit = {
    println("I dont fly")
  }
}
