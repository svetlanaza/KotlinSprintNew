package lesson_18

open class Box() {

    open fun calculateTheArea() = 0

}

class BoxCube(private val side: Int) : Box() {
    override fun calculateTheArea(): Int {
        return (6 * side * 2)
    }
}


class BoxSquare(private val length: Int, private val width: Int, private val height: Int) : Box() {
    override fun calculateTheArea(): Int {
        return (2 * (length * width + width * height + length * height))
    }
}

fun main() {
    val boxCube = BoxCube(12)
    println("Площадь кубической посылки составляет ${boxCube.calculateTheArea()} см")

    val boxSquare = BoxSquare(21, 5, 8)
    println("Площадь кубической посылки составляет ${boxSquare.calculateTheArea()} см")
}