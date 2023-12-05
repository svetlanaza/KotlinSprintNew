package lesson_4

fun main() {
    val reservationToday = 13
    val reservationTomorrow = 9

    println("Свободные столики на сегодня: ${reservationToday != TOTAL_TABLES}")
    println("Свободные столики на завтра: ${reservationTomorrow != TOTAL_TABLES}")
}
const val TOTAL_TABLES = 13