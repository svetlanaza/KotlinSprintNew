package lesson_16

class Cube() {

    private val number = (1..6).random()

    fun getNumber() = number
    }

fun main() {
    val cube = Cube()
    println(cube.getNumber())


}