package lesson_5

fun main() {
    val number1 = (0..42).random()
    val number2 = (0..42).random()

    println("Введите по очереди два числа")

    val firstNumber = readln().toInt()
    val secondNumber = readln().toInt()

    if ((firstNumber == number1 && secondNumber == number2) || (firstNumber == number2 && secondNumber == number1))
        println(
            "Поздравляем, вы выиграли главный приз! \n" +
                    "Загаданные числа $number1 и $number2")

    else if ((firstNumber == number1 && secondNumber != number2) || (firstNumber != number1 && secondNumber == number2))
        println("Поздравляем, вы выиграли утешительный приз! \n" +
                "Загаданные числа $number1 и $number2")
    else
        println("Неудача! \n" +
                "Загаданные числа $number1 и $number2")
    }
