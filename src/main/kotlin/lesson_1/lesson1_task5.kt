package lesson_1

fun main() {
    val seconds = 6480
    val minutes = seconds / 60
    val hours = minutes / 60
    val remainingMinutes = minutes % 60
    val remainingSeconds = seconds % 60

    println("%02d:%02d:%02d".format(hours, remainingMinutes, remainingSeconds))
}