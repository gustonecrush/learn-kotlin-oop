package data

open class Shape(val name: String,
                 val shape: Int,
                 val color: String) {

    constructor(name: String, shape: Int) : this(name, shape, "")
    constructor(name: String) : this(name, -1)

    open val corner: Int = -1

    open fun printName() {
      println("This is Shape")
    }
}

class Rectangle : Shape {

    constructor() : super("Rectangle", 4)
    constructor(color: String) : super("Rectangle", 4, color)

    override val corner: Int = 4
    val parentCorner: Int = super.corner

    override fun printName() {
        println("This is Rectangle, with parent =>")
        super.printName()
    }
}