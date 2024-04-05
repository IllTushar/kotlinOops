package CompanionObject

class Student private constructor(){
    companion object{
        private var student:Student?=null

        //synchronized this keyword make it thread safe
        fun getInstance()= synchronized(this){
            if (student==null){
              student = Student()
            }
            student
        }

        operator fun invoke()= synchronized(this){
            if (student==null){
                student = Student()
            }
            student
        }
    }
}