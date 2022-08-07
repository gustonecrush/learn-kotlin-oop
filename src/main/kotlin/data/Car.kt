package data

class Car {

    var brand: String = ""
    var year: Int = 2020
    var fuel: String = "Solar"

    constructor(paramBrand: String, paramYear: Int) {
        brand = paramBrand
        year  = paramYear
    }

    constructor(paramBrand: String, paramYear: Int, paramFuel: String) : this(paramBrand, paramYear) {
        fuel = paramFuel
    }

    override fun toString(): String {
        return "Car with name $brand"
    }

}