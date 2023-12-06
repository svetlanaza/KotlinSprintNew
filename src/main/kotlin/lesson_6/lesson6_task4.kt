package lesson_6

fun main() {
    val number = (1..9).random()
    var counter = 5

    do {
        println("Введите число от 1 до 9!")
        val numberEnter = readln().toInt()

        if (numberEnter == number) {
            println("Это была великолепная игра!")
            return

        } else {
            --counter
            println("Неверно! Осталось $counter попыток.")
        }
    } while (counter > 0)

    println("Было загадано число $number.")
}

