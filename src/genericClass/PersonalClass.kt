package genericClass

class PersonalClass<T, X>(val id: T, val name: X) {
    fun details() {
        println(id)
        println(name)
    }
}