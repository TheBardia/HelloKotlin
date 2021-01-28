fun sayHello(name: String) {
    println("Hello $name!")
}

fun sayHiToAll(greeting: String, names: List<String>) {
    names.forEach {
        println("$greeting $it!")
    }
}

// vararg eliminates the need for always passing a value. vararg means 0 or more of something. so putting nothing also works
fun sayHiToAllVarArg(greeting: String, vararg names: String) {
    names.forEach {
        println("$greeting $it!")
    }
}

fun main() {
/*
    sayHello("Bardia")

    val arrayTest = arrayOf("Kotlin", "C", "Java", "SQL")
    arrayTest.forEach { item ->
        println(item)
    }

    arrayTest.forEachIndexed { index, item ->
        println("$item is at index $index")
    }

    val arrayTest = listOf("Kotlin", "C", "Java", "SQL")
    arrayTest.forEach { item ->
        println(item)
    }


    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value ->
        println("Key: $key -> Value: $value")
    }
*/

//    val arrayTest = arrayOf("Bardia", "Nikki", "Ali")

//  sayHiToAll("Hello", arrayTest)

//    sayHiToAllVarArg( greeting = "Hello", names = *arrayTest)

    //val bardia = Person(firstName = "Bardia", lastName = "Goharanpour")
    val bardia = Person()

    bardia.nickname = "babar"
    var test: String
    test = bardia.nickname

}