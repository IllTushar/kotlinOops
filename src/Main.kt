import abstractClass.PreCoffee
import constructor.Box
import getterAndsetter.Animal
import inheritance.PremiumCoffee
import interfaces.Cat
import interfaces.Dog

fun main() {

    /*
    Example for getter and setter
    val animal = Animal()
    animal.name = "Tiger"
    println("The animal name is ${animal.name}")
     */

    /*
       Example for Constructor.
        val box = Box(10, 12, 25)
        println("The length of box is ${box.length}")
        println("The height of box is ${box.height}")
        println("The width of box is ${box.width}")
        println("The volume of box is ${box.volume}")
     */

    /*
        Example for Inheritance.
        val coffee =PremiumCoffee(1300.0,"Black")
        coffee.cappuccino()
        coffee.makeCoffee()
        println("Premium Coffee price is ${coffee.price}")
        println("Premium Coffee Color is ${coffee.color}")
     */

    /*

        Example Abstract Class
         val coffee = PreCoffee(250.0, "Black")
         coffee.coffee()
         println("Premium Coffee price is ${coffee.price}")
         println("Premium Coffee Color is ${coffee.color}")

     */

    val cat = Cat()
    cat.sound()
    cat.properties(4)

    val dog = Dog()
    dog.sound()
    dog.properties(4)
}
