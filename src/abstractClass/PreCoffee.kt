package abstractClass

class PreCoffee(var price: Double, var color: String) : Coffee() {

    override fun coffee() {
        println("This is preCoffee")
    }

}