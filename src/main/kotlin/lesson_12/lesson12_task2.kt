package lesson_12

class WeatherData(var dayTemperature: Int,
                  var nightTemperature: Int,
                  var isPrecipitation: Boolean,) {


    fun displayWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Наличие осадков: ${if (isPrecipitation) "Да" else "Нет"}")
    }
}
fun main() {
    val weatherDay1 = WeatherData(
            20,
            14,
            true,)

    weatherDay1.displayWeatherInfo()
    println()

    val weatherDay2 = WeatherData(
        27,
        16,
        false,
    )

    weatherDay2.displayWeatherInfo()
}