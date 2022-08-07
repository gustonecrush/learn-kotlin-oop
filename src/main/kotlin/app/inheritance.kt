package app

import data.Manager
import data.Rectangle
import data.Shape
import data.VicePrecident

fun main() {

    val farhan = Manager("Farhan")
    farhan.sayHello("Gian")

    val rajjo = VicePrecident("Rajjo")
    rajjo.sayHello("Azza")

    val shape = Shape()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)
    println(rectangle.parentCorner)
    rectangle.printName()

}