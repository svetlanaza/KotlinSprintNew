package lesson_4

fun main() {
    println("Введите данные о повреждениях (true или false)")

    val isDamage = readln().toBoolean()

    println("Введите количество экипажа")

    val crew = readln().toInt()

    println("Введите количество провизии")

    val provision = readln().toInt()

    println("Введите данные о благоприятных метеоусловиях (true или false)")

    val isWeatherGood = readln().toBoolean()

    if ((isDamage == IS_CASE_DAMAGE) &&
        (crew >= CREW_MIN) &&
        (crew <= CREW_MAX) &&
        (provision > PROVISION_MIN)
        ) {

        println("Корабль может выходить в плавание: true")

    } else if ((isDamage == IS_CASE_DAMAGE) &&
        (crew == CREW_MAX) &&
        (provision >= PROVISION_MIN) &&
        (isWeatherGood == IS_WEATHER_GOOD)
    ) {

        println("Корабль может выходить в плавание: true")

    } else {

        println("Корабль может выходить в плавание: false")
    }
}

const val IS_CASE_DAMAGE = false
const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50
const val IS_WEATHER_GOOD = true