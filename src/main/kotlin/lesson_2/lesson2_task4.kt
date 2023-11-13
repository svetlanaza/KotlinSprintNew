package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val crystalOreBonus = crystalOre / 5
    val ironOreBonus = ironOre / 5
    val crystalOreAll = crystalOre + crystalOreBonus
    val ironOreAll = ironOre + ironOreBonus

    println(crystalOreAll)
    println(ironOreAll)
}