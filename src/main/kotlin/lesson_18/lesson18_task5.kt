package lesson_18

abstract class Screen() {

    abstract fun draw(x: Int, y: Int): String
    abstract fun draw(x: Float, y: Float): String
}

class Point(private val figure: String = "Точка") : Screen() {

    override fun draw(x: Int, y: Int): String = "$figure имеет координаты: x = $x, y = $y"
    override fun draw(x: Float, y: Float): String = "$figure имеет координаты: x = $x, y = $y"
}

class Circle(private val figure: String = "Круг") : Screen() {

    override fun draw(x: Int, y: Int): String = "$figure имеет координаты: x = $x, y = $y"
    override fun draw(x: Float, y: Float): String = "$figure имеет координаты: x = $x, y = $y"
}

class Square(private val figure: String = "Квадрат") : Screen() {

    override fun draw(x: Int, y: Int): String = "$figure имеет координаты: x = $x, y = $y"
    override fun draw(x: Float, y: Float): String = "$figure имеет координаты: x = $x, y = $y"
}

fun main() {
    val point = Point("Точка")
    println(point.draw(1.1f, 2.18f))

    val circle = Circle("Круг")
    println("Фигура ${circle.draw(11, 7)}")

    val square = Square("Квадрат")
    println("Фигура ${square.draw(7, 2)}")
}



