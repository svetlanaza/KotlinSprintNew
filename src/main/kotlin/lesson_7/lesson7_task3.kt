package lesson_7

fun main() {
    println("Введте число")
    val number = readln().toInt()
    for (i in 0..number step 2) {
        println(i)
    }
}