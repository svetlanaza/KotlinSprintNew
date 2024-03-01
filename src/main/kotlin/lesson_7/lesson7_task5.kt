package lesson_7

fun main() {

    println("Сколько символов будет в вашем пароле?")

    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val numberSymbolMin = 6
    val numberSymbolMax = readln().toInt()
    val password = if (numberSymbolMax >= numberSymbolMin) {
        chars.shuffled().take(numberSymbolMax).joinToString("")
    } else {
        println("Недостататочно символов")
    }
    println("Ваш пароль: $password")
}



