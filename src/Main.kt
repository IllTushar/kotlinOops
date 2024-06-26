import dataClass.dataModel
import genericClass.PersonalClass
import nestedClass.Box

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


    /*
     This Student is used to show the delegates.
        val student = Student()
        student.firstName = "Tushar"
        student.lastName = "Gupta"
        println(student)
     *//*

    println(CompanionObject.Student.getInstance())
    println(CompanionObject.Student.getInstance())

    //Note: when user use invoke function then they
    //can directly call class constructor even it was private as well
    //call invoke function.
    println(CompanionObject.Student())
    println(CompanionObject.Student.invoke())
   */
    /*
      Note: in companionObject we would be written lots of
      boilerplate code so we should using singleton class
      denoted by object keyword

      SingeltonClass.Student
     */

    /*
    "Note: Data class could not be inherited because it could
           not be make open or abstract but in data class
           you can inherit other classes or interface!!"


    val person = dataModel(1, "Tushar", "India")
    println(person)
    println(person.printName())


    //componentN function
    println(person.component1())
    println(person.component2())
    println(person.component3())

    println()

    //destructuring
    val (id, name, country) = person

    println(id)
    println(name)
     */

    /*
    Generic class
    val personalDetails = PersonalClass<Int,String>(1,"Tushar Gupta")
    personalDetails.details()
     */


    /*
     we can't access Content class directly using box instance
     this possible only when we are using inner keyword with Content
     class. otherwise we can access Box.Content("You can do it")
    */

    val box = Box(10, 10, 10)
    val content = box.Content("You can do it!!")
    content.printContent()
    content.printBoxInfo()
}


