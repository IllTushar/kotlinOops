package nestedClass

class Box(val width: Int, val length: Int, val height: Int) {
    /*
     we can't access Box class members directly
     but if we are using inner keyword then,
     we can directly access parent class members.
     */
    inner class Content(val content: String) {
        fun printBoxInfo() {
            println("width: $width , length : $length , height : $height")
        }

        fun printContent() {
            println(content)
        }
    }
}