package lesson_12

class WeatherDay() {
    var dayTemperature: Int = 25
    var nightTemperature: Int = 15
    var isPrecipitation: Boolean = false

    fun displayWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherDay1 = WeatherDay()
    weatherDay1.dayTemperature = 20
    weatherDay1.nightTemperature = 14
    weatherDay1.isPrecipitation = true
    weatherDay1.displayWeatherInfo()

    val weatherDay2 = WeatherDay()
    weatherDay2.dayTemperature = 27
    weatherDay2.nightTemperature = 16
    weatherDay2.isPrecipitation = false
    weatherDay2.displayWeatherInfo()
}