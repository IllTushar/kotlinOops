package interfaces

class Dog : Animal {
    override fun properties(legs: Int) {
        println("The dogs have $legs legs")
    }

    override fun sound() {
        println("The dogs sound is Bark")
    }
}