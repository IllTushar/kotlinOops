package constructor
//Primary Constructor..
class Box(var length: Int, var height: Int, var width: Int) {
    /* You can make many init block in a code . but only use
    because it is recommended
     */
    init {
        println("This is init block!!")
    }

    val volume
        get() = length * height * width
}