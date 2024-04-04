package DelegatesProperties

class Student {
    var firstName:String? by NameDelegates()
    var lastName:String? by  NameDelegates()

    override fun toString(): String {
        return "$firstName $lastName"
    }
}