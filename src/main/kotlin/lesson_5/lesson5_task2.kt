package lesson_5

fun main() {
    println("Введите год рождения")

    val yearBorn = readln().toInt()
    val yearNow = 2023

    if ((yearNow - yearBorn) >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
}
const val AGE_OF_MAJORITY = 18