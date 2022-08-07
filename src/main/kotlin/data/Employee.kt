package data

open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

open class Manager(name: String) : Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello $name, my name is manager ${this.name}")
    }
}

final class VicePrecident(name: String) : Employee(name)
