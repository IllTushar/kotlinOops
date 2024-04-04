import DelegatesProperties.Student
import Deligates.ClassDownloader
import Deligates.ClassPlayer
import Deligates.fileDownloadClass

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

    /*

      val cat = Cat()
      cat.sound()
      cat.properties(4)

      val dog = Dog()
      dog.sound()
      dog.properties(4)

     */

    /*
    //anonymous inner class
    /*
    when use anonymous inner class
    we are using object keyword
    Syntax is object: interface
    
     Anonymous classes in Kotlin are used when you need to create
     an instance of a class that implements an interface or extends
     a class without explicitly defining a named subclass.
     This can be useful for creating one-off implementations
     of interfaces or extending classes in a concise manner.

     */

    //Class instance
    val downloader = Download()
    downloader.download = object : Downloader {
        override fun downloadingStart() {
             println("Downloading Start...")
        }

        override fun downloadingCompleted() {
            println("Downloading Completed...")
        }

    }
    downloader.downloadingStart()

     */

    /*

    In Kotlin, delegates are a powerful feature that allows you to implement the delegation pattern.
    Delegation is a design pattern where an object delegates some of its responsibilities to another object.
    This can help in code reuse, by allowing you to compose classes rather than inherit from them.

    val files = fileDownloadClass(ClassDownloader("Tushar_Voice"),ClassPlayer("VoiceNote"))
    files.downloadVideo()
    files.player()

     */


    val student = Student()
    student.firstName = "Tushar"
    student.lastName = "Gupta"
    println(student)
}
