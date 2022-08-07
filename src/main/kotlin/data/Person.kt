package data

class Person(firstNameParam: String,
             middleNameParam: String?,
             lastNameParam: String) {

    // initializer block
    init {
        println("Person has been created")
    }

    // properties
    var firstName: String = firstNameParam
    val middleName: String? = middleNameParam
    var lastName: String = lastNameParam

}
