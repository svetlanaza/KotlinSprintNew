package lesson_6

fun main() {
    println("Сколько секунд вы хотите засечь?")

    val number = readln().toLong()
    Thread.sleep(number * 1000)

    println("Прошло $number секунд.")
}


