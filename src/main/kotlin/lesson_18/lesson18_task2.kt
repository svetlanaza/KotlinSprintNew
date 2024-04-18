package lesson_18

abstract class PlayingCube(
    private val numberOfGrains: Int
) {

    fun rollTheCube() {
        println((1..numberOfGrains).random())
    }
}

class Cube4() : PlayingCube(4) {}

class Cube6() : PlayingCube(6) {}

class Cube8() : PlayingCube(8) {}

fun main() {
    val cube4 = Cube4()
    val cube6 = Cube6()
    val cube8 = Cube8()

    val listResults: List<PlayingCube> = listOf(cube4, cube6, cube8)

    println("Список выпавших номеров:")

    listResults.forEach() {
        it.rollTheCube()
    }
}





