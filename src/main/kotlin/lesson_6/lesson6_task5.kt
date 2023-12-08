package lesson_6

fun main() {
    var counter = 3

    do {
        val number1 = (1..9).random()
        val number2 = (2..9).random()

        println("Сложите два числа $number1 и $number2")
        val answer = readln().toInt()
        if (answer != number1 + number2) {
            println("Не верно, осталось ${--counter} попыток")

        } else {
            println("Добро пожаловать!")
            return
        }

    } while (counter > 0)

    println("Доступ запрещен!")
}