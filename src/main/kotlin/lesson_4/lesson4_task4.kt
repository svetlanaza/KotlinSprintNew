package lesson_4

fun main() {
    val numberDay = 5
    val isEven = (numberDay % 2 == 0)

    val hands = !isEven
    val foots = isEven
    val back = isEven
    val abs = !isEven

    println("Упражнения для рук:    $hands \nУпражнения для ног:    $foots \nУпражнения для спины:  $back " +
            "\nУпражнения для пресса:  $abs")
}