package lesson_4

const val WEATHER = "sunny"
const val TENT = "open"
const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {
    val todayWeather = "sunny"
    val tentNaw = "open"
    val humidityAre = 20
    var seasonNaw = "winter"

    val isFavorableConditions = (todayWeather == WEATHER) && (tentNaw == TENT)
                                && (humidityAre == HUMIDITY) && (seasonNaw != SEASON )

    println(isFavorableConditions)

}
