package app

import data.Computer
import data.Laptop

fun printObject(any: Any) {
//    if(any is Laptop) {
//        println("Laptop ${any.brand}")
//    } else if(any is Computer) {
//        println("Computer ${any.brand}")
//    } else {
//        println(any)
//    }

    when (any) {
        is Laptop -> println("Laptop ${any.brand}")
        is Computer -> println("Computer ${any.brand}")
        else -> println(any)
    }
}

    // unsafe casts
    fun printString(any: Any) {
        val value = any as? String
        println(value)
    }

fun main() {
    printString("Farhan")
    printString(1)
}


