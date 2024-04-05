package DelegatesProperties

class Student {

    //NameDelegates is a Delegate class for the Student class.
    var firstName: String? by NameDelegates()
    var lastName: String? by NameDelegates()

    override fun toString(): String {
        return "$firstName $lastName"
    }

}