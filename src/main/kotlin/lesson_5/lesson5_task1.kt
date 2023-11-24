package lesson_5

fun main() {
    val number1 = (0..10).random()
    val number2 = (0..10).random()

    println("Подтвердите,что вы не робот, сложите два числа: $number1 и $number2")

    val answer = readln().toInt()
    if (answer == number1 + number2)
        println("Добро пожаловать!")

    else println("Доступ запрещен!")
}