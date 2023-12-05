package lesson_2

fun main() {
    val departureTime = 9
    val minuteOfDeparture = 39
    val travelTime = 457
    val travelTimeHours = travelTime / 60
    val travelTimeMinutes = travelTime % 60
    val sumHours = departureTime + travelTimeHours
    val sumMinutes = minuteOfDeparture + travelTimeMinutes
    val sumMinutesInHours = sumMinutes / 60
    val arrivalHour = sumHours + sumMinutesInHours
    val minutesOfArrival = sumMinutes % 60

    print(arrivalHour)
    print(":")
    print(minutesOfArrival)

}