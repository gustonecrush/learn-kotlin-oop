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

    val shape = Shape("Cirlce", 7)
    println(shape.corner)
    println(shape.name)
    println(shape.shape)

    val rectangle = Rectangle()
    println(rectangle.corner)
    println(rectangle.parentCorner)
    println(rectangle.name)
    println(rectangle.shape)
    println(rectangle.color)
    rectangle.printName()

}