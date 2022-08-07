package app

import data.Car

fun main() {

    val car = Car("Honda", 2022, "Solar")
    println(car.brand)
    println(car.toString())

    val car2 = Car("Rush", 2020)
    println(car2.brand)

}