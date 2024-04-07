package dataClass

data class dataModel(
    val id: Int,
    val name: String,
    val country: String
):dataInterface{
    override fun printName() {
        println("This interface!!")
        println("Note: Data class could not be inherit because it could" +
                "not be make open or abstract but in data class you can inherit other classes or interface!!")
    }

}