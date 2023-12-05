package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val bonusPercent = 20.0
    val allPercent = 100

    val bonusCoefficient = (bonusPercent / allPercent)
    val crystalOreBonus = (crystalOre * bonusCoefficient).toInt()
    val ironOreBonus = (ironOre * bonusCoefficient).toInt()

    println("Добыто бонусной кристаллической руды: $crystalOreBonus")
    println("Добыто бонусной железной руды: $ironOreBonus")
}