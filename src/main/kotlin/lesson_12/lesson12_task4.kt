package lesson_12

const val KELVIN_IN_CELSIUS = 273.15

class WeatherInfo(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int) {
    var dayTemperature: Int = (dayTemperatureKelvin - KELVIN_IN_CELSIUS).toInt()
    var nightTemperature: Int = (nightTemperatureKelvin - KELVIN_IN_CELSIUS).toInt()
    var isPrecipitation: Boolean = false

    init {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherDay = WeatherInfo(301,290)

}