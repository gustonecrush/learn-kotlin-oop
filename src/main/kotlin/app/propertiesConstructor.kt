package app

import data.Address

fun main() {

    val address = Address("St Asia Africa", "Bandung", "Indonesia")

    println(address.street)
    println(address.city)
    println(address.country)

}