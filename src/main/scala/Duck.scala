import Flys.IFlyStrategy
import Quacks.IQuackStrategy

case class Duck(quackBehavior: IQuackStrategy, flyBehavior: IFlyStrategy) {
  def fly(): Unit = {
    this.flyBehavior.fly()
  }

  def quack(): Unit = {
    this.quackBehavior.quack()
  }
}
