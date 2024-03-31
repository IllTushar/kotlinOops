package interfaces

class Cat : Animal {
    override fun properties(legs: Int) {
        println("Cat has $legs legs")
    }

    override fun sound() {
        println("The cat sound is meow!!")
    }

}