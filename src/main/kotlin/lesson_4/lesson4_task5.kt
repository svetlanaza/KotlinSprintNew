package lesson_4

fun main() {
    println("Введите данные о повреждениях (true или false)")

    val caseDamage = readln().toBoolean()

    println("Введите количество экипажа")

    val crew = readln().toInt()

    println("Введите количество провизии")

    val provision = readln().toInt()

    println("Введите данные о благоприятных метеоусловиях (true или false)")

    val weatherGood = readln().toBoolean()

    if ((caseDamage == CASE_DAMAGE) &&
        (crew >= CREW_MIN) &&
        (crew <= CREW_MAX) &&
        (provision >= PROVISION_MIN) &&
        ((weatherGood == WEATHER_GOOD) || (weatherGood != WEATHER_GOOD))
    ) {

        println(true)

    } else if ((caseDamage != CASE_DAMAGE) &&
        (crew == CREW_MAX) &&
        (provision > PROVISION_MIN) &&
        (weatherGood == WEATHER_GOOD)
    ) {

        println(true)

    } else {

        println(false)
    }
}

const val CASE_DAMAGE = false
const val CREW_MIN = 55
const val CREW_MAX = 70
const val PROVISION_MIN = 50
const val WEATHER_GOOD = true