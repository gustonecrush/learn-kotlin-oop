package data

class Person(firstNameParam: String,
             middleNameParam: String?,
             lastNameParam: String) {

    // properties
    var firstName: String = firstNameParam
    val middleName: String? = middleNameParam
    var lastName: String = lastNameParam

}
