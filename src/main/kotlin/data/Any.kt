package data

class Laptop(val brand: String)
class Computer(val brand: String)

fun main() {
    var laptop = Laptop("Apple")
    println(laptop.brand)
}