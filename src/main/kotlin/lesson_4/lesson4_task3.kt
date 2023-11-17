package lesson_4

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {
    val isSunnyNow = true
    val isTentNow = true
    val humidityAre = 20
    val seasonNow = "winter"

    val isFavorableConditions = (isSunnyNow == IS_SUNNY) && (isTentNow == IS_TENT_OPEN)
                                && (humidityAre == HUMIDITY) && (seasonNow != SEASON )

    println(isFavorableConditions)

}
