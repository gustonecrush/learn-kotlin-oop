package data

class Person(firstNameParam: String,
             middleNameParam: String,
             lastNameParam: String,
             gender: String) {

    // initializer block
    init {
        println("Person has been created")
    }

    // secondary constructor
    constructor(firstNameParam: String, lastNameParam: String, gender: String) :
            this(firstNameParam, "", lastNameParam, gender) {
                println("Using secondary constructor is success")
            }

    constructor(firstNameParam: String) :
            this(firstNameParam, "", "") {
                println("Using secondary constructor 2 is success")
            }

    // properties
    var firstName: String = firstNameParam
    val middleName: String = middleNameParam
    var lastName: String = lastNameParam
    var gender: String = gender

    // functions
    fun sayHello(yourName: String): Unit {
        println("Hello $yourName, my name is $firstName")
    }

    fun getFullName(): String {
        return "$firstName $middleName $lastName"
    }

}
