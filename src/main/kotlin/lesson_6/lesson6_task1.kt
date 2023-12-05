package lesson_6

fun main() {
    println("Создайте логин")

    val login = readln()

    println("Создайте пароль")

    val password = readln()

    println("Регистрация прошла успешно")

    do {
        println("Введите логин")
        val enterLogin = readln()
        println("Введите пароль")
        val enterPassword = readln()
    } while (enterLogin != login && enterPassword != password)
    println("Авториизация прошла успешно")

}