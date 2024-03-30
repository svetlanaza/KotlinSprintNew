package lesson_15

abstract class WeatherStationStats()

class Temperature(val data: Int) : WeatherStationStats()

class PrecipitationAmount(val data: String) : WeatherStationStats()

class WeatherServer {
    fun sendMessage(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> {
                println("Отправка данных температуры на сервер: ${weatherData.data}°C")
            }

            is PrecipitationAmount -> {
                println("Отправка данных о наличии осадков на сервер: ${weatherData.data}")
            }

            else -> {
                println("Неизвестный тип данных")
            }
        }
    }
}

fun main() {
    val temperature = Temperature(10)
    val precipitationAmount = PrecipitationAmount("Облачность с прояснениями")
    val weatherServer = WeatherServer()

    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)
}




