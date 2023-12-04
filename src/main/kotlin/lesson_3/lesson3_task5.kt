package lesson_3

fun main() {
    val inputData = "D2-D4;0"

    val splitData = inputData.split("-", ";")
    val from = splitData[0]
    val where = splitData[1]
    val turnNumber = splitData[2]

    println(from)
    println(where)
    println(turnNumber)
}