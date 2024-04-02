package lesson_16

class Cube {

    private val number = (1..6).random()

    fun getPrintNumber() {
        println(number)
    }
}

fun main() {
    val cube = Cube()
    cube.getPrintNumber()
}