package lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val rate = 16.7
    val longDeposit = 20
    val sum = deposit * (1 + rate / 100).pow(20)

    println(String.format("%.3f",sum))
}