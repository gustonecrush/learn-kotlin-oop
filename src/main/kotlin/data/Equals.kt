package data

class Company(val name: String) {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Company -> name == other.name
            else -> false
        }
    }
}

fun main() {
    val company1 = Company("Farhan")
    val company2 = Company("Farhan")
    println(company1 == company2)
    println(company1.equals(company2))
}