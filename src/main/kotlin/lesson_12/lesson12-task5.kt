package lesson_12

class WeatherMonth(dayTemperature: Int, nightTemperature: Int, isPrecipitation: Boolean) {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isPrecipitation: Boolean = false

    fun displayWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherList = List(30) {
        WeatherMonth(
            dayTemperature = (0.. 50).random(),
            nightTemperature = (0..50).random(),
            isPrecipitation = true
        ).displayWeatherInfo()



    }
    }