package DelegatesProperties

import com.sun.jdi.Value
import kotlin.reflect.KProperty

class NameDelegates {
    var firstName: String? = null


    operator fun getValue(
        thisRef: Any?,
        properties: KProperty<*>?
    ): String? {
        return firstName
    }

    operator fun setValue(student: Student, property: KProperty<*>, value: String?) {
        if (value != null && value.length > 2) {
            firstName = value.trim().toUpperCase()
        }
    }
}