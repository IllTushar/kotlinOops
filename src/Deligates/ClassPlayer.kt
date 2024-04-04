package Deligates

class ClassPlayer(val file:String):Player {
    override fun player() {
        println("$file.mp3")
    }
}