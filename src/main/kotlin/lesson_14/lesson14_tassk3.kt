package lesson_14

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}
fun main() {
    val figures = listOf(
        Circle(COLOR_BLACK, 5.0),
        Rectangle(COLOR_WHITE, 4.0, 7.0),
        Circle(COLOR_WHITE, 3.0),
        Rectangle(COLOR_BLACK, 2.0, 3.0)
    )

    var totalBlackPerimeter = 0.0
    var totalWhiteArea = 0.0

    figures.forEach { figure ->
        when (figure.color) {
            COLOR_BLACK -> totalBlackPerimeter += figure.perimeter()
            COLOR_WHITE -> totalWhiteArea += figure.area()
        }
    }

    println("Сумма периметров черных фигур: $totalBlackPerimeter")
    println("Сумма площадей белых фигур: $totalWhiteArea")
}

const val COLOR_BLACK = "black"
const val COLOR_WHITE = "white"