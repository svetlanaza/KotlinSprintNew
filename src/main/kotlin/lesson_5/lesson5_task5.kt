package lesson_5

import kotlin.random.Random

fun main() {
    val winningNumbers = List(3) {Random.nextInt(1,42);
        Random.nextInt(1,42);
        Random.nextInt(1,42)}

    println("Введите по очереди три числа")

    val mutableList = mutableListOf(readln().toInt(), readln().toInt(), readln().toInt())
    val intersectedList = winningNumbers.intersect(mutableList).size

    when(intersectedList) {
        3 -> println("Вы выиграли джекпот! Угадали 3 числа")
        2 -> println("Вы выиграли второй приз! Угадали 2 числа")
        1 -> println("Вы выиграли утешительнй приз! Угадали 1 число")
        else -> println("Вы не угадали ни одно число!")
    }
    println("Выигрышные числа: $winningNumbers")
    }


