package lesson_5

import kotlin.random.Random

fun main() {
    val winningNumbers = List(3) {Random.nextInt(1,42);
        Random.nextInt(1,42);
        Random.nextInt(1,42)}


    println(winningNumbers)
    println("Введите по очереди три числа")

    val number1 = readln().toInt()
    val number2 = readln().toInt()
    val number3 = readln().toInt()
    val mutableList = mutableListOf(3)
    }


