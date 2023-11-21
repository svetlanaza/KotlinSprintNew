package lesson_4

fun main() {
    val numberDay = 5
    val isEven = (numberDay % 2 == 0)

    val hands = !isEven
    val foots = isEven
    val back = isEven
    val abs = !isEven

    println("Упражнения для рук:    $hands")
    println("Упражнения для ног:    $foots")
    println("Упражнения для спины:  $back")
    println("Упражнения для спины:  $abs")
}