import Strategies.{BigStrategy, HighFly, LoudQuack, LowFly, MediumStrategy, QuietQuack, SmallStrategy}

object App {


  def main(args: Array[String]): Unit = {
    /*
    A demonstration of a strategy pattern.

    Here instead of using subclasses for different kinds of ducks (city duck, country duck)
    We use strategies that have a consistent interface and pass the into our generic "Duck" object

    We therefore create both a city and country duck by way of strategy not subclass.
     */


    //    a city duck is loud and flies low
    println("SEE THE CITY DUCK...")
    val cityDuck = new Duck(LoudQuack, LowFly, MediumStrategy)
    cityDuck.quack()

    // a country duck is quick, but flies HIGH
    println("\nBEHOLD A COUNTRY DUCK...")
    val countryDuck = new Duck(QuietQuack, HighFly, BigStrategy)
    countryDuck.fly()
    countryDuck.quack()

    val delta = {
      if (cityDuck.height > countryDuck.height) {
        "bigger than"
      } else {
        "smaller than"
      }
    }

    println(s"City duck is $delta country duck")

    //TODO: should the strategies be objects or classes?
  }
}
