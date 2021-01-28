class Person(val firstName: String = "fName", val lastName: String = "lName") {

    var nickname: String? = null
        set(value) {
            field = value
            println("New nickname set as $field")
        }
        get() {
            println("returned value is $field")
            return field
        }

}