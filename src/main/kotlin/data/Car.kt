package data

class Car(paramBrand: String, paramYear: Int = 2020) {

    init {
        println("Car has been created")
    }

    var brand: String = paramBrand
    var year: Int = paramYear

}