import Strategies.{IFlyStrategy, IQuackStrategy, ISizeStrategy}

class Duck(quackBehavior: IQuackStrategy, flyBehavior: IFlyStrategy, sizeStrategy: ISizeStrategy) {

  val height: Int = sizeStrategy.height

  def fly(): Unit = {
    this.flyBehavior.fly()
  }

  def quack(): Unit = {
    this.quackBehavior.quack()
  }
}
