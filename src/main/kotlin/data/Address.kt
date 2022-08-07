package data

class Address(var street: String,
              var city: String,
              var country: String) {

    fun myLocation(city: String) {
        println("Location: $city, ${this.city}")
    }

}