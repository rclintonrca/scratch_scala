import Quacks.{LoudQuack, QuietQuack}
import Flys.{HighFly, LowFly}

object App {


  def main(args: Array[String]): Unit = {
    /*
    A demonstration of a strategy pattern.

    Here instead of using subclasses for different kinds of ducks (city duck, country duck)
    We use strategies that have a consistent interface and pass the into our generic "Duck" object

    We therefore create both a city and country duck by way of strategy not subclass.
     */


    //    a city duck is loud and flies low
    println(("SEE THE CITY DUCK..."))
    val cityDuck = Duck(LoudQuack, LowFly)
    cityDuck.quack()

    // a country duck is quick, but flies HIGH
    println(("\nBEHOLD A COUNTRY DUCK..."))
    val countryDuck = Duck(QuietQuack, HighFly)
    countryDuck.fly()
    countryDuck.quack()
  }
}
