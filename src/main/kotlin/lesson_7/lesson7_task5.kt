package lesson_7

fun main() {

    println("Сколько символов будет в вашем пароле?")

    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val numberSymbolMin = 6
    val numberSymbolMax = readln().toInt()
    var password = ""

    for (i in 1..numberSymbolMax) {
        password += chars.random()

    }
    println("Ваш пароль: $password")
}

