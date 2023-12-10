package lesson_4

fun main() {
    var weight = 20
    var volume = 80

    println("Груз, весом $weight кг и обьемммом $volume л " +
            "подходит для категории Average: ${weight >= WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME}")

    weight = 50
    volume = 100

    println("Груз, весом $weight кг и обьемммом $volume л " +
            "подходит для категории Average: ${weight >= WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME}")

}

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME = 100