package lesson_1

fun main() {
    val seconds = 6480
    val minutes = seconds / 60
    val hours = minutes / 60
    val remainingMinutes = minutes % 60
    val remainingSeconds = seconds % 60
    val hoursFormatTime = String.format("%02d",hours)
    val secondsFormatTime = String.format("%02d",remainingSeconds)

    print(hoursFormatTime)
    print(":")
    print(remainingMinutes)
    print(":")
    println(secondsFormatTime)

}