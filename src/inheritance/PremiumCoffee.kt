package inheritance

class PremiumCoffee(var price: Double, var color: String) : Coffee(price, color) {
    fun cappuccino() {
        println("Your cappuccino is Here!!")
    }
}