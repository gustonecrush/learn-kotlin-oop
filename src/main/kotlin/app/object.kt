package app

import data.Car
import data.Person

fun main() {

    var farhan = Person("Farhan", "Ghifary", "Augustiansyah", "male")
    println()
    var rajjo  = Person("Rajjo", "Kevin Alvino", "male")
    println()
    var gian   = Person("Gian")
    println()

    gian.sayHello(farhan.firstName)
    gian.sayHello("Fiza", "Tanah Putih")
    println(gian.getFullName())
    println(rajjo.getFullName())

}
