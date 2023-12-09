package lesson_7

fun main() {
    println("Сколько секунд вы хотите засечь?")
    val seconds = readln().toInt()

    for (i in seconds downTo 0) {
        Thread.sleep(1000)
        println("Осталось $i секунд")
    }
    println("Время вышло")
}