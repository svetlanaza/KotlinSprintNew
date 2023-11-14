package lesson_3

fun main() {
    var from = "E2"
    var where = "E4"
    var moveNumber = 1

    println("Ход № $moveNumber: $from-$where")
    from = "D2"
    where = "D3"
    moveNumber++

    println("Ход № $moveNumber: $from-$where")
}