package lesson_3

fun main() {
    val inputData = "D2-D4;0"

    val splitData = inputData.split("-")
    val from = splitData[0]
    val intermediateData = splitData[1].split(";")
    val where = intermediateData[0]
    val turnNumber = intermediateData[1]

    println(from)
    println(where)
    println(turnNumber)
}
