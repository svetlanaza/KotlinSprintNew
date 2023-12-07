package lesson_7

fun main() {
    val code = (1000..9999).random()

    do {
        println("Ваш код авторизации N: $code")
        println("Введите код")
        val codeEnter = readln().toInt()

    } while (codeEnter != code)
    println("Добро пожаловать!")
}