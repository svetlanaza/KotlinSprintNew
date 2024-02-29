package lesson_12

class WeatherData(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isPrecipitation: Boolean,
) {


    fun displayWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherDay1 = WeatherData(
        dayTemperature = 20,
        nightTemperature = 14,
        isPrecipitation = true,
    )

    weatherDay1.displayWeatherInfo()
    println()

    val weatherDay2 = WeatherData(
        dayTemperature = 27,
        nightTemperature = 16,
        isPrecipitation = false,
    )

    weatherDay2.displayWeatherInfo()
}