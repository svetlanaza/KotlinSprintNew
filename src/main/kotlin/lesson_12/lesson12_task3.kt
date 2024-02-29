package lesson_12

const val KELVIN_IN_CELSIUS = 273.15

class WeatherDayInfo(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int) {
    var dayTemperature: Int = (dayTemperatureKelvin - KELVIN_IN_CELSIUS).toInt()
    var nightTemperature: Int = (nightTemperatureKelvin - KELVIN_IN_CELSIUS).toInt()
    var isPrecipitation: Boolean = false

    fun displayWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherDay1 = WeatherDayInfo(301,290)
    weatherDay1.isPrecipitation = true
    weatherDay1.displayWeatherInfo()

    val weatherDay2 = WeatherDayInfo(303,292)
    weatherDay2.isPrecipitation = false
    weatherDay2.displayWeatherInfo()
}