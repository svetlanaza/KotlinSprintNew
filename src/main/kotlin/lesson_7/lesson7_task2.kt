package lesson_7

fun main() {
    val code = (1000..9999).random()
    var codeEnter: Int

    do {
        println("Ваш код авторизации N: $code")
        println("Введите код")
        codeEnter = readln().toInt()

    } while (codeEnter != code)
    println("Добро пожаловать!")
}