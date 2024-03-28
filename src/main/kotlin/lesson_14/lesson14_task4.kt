package lesson_14

open class HeavenlyBody(
    val name: String,
    val isAtmosphere: Boolean,
    val isPossibilityOfDisembarkation: Boolean,
)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isPossibilityOfDisembarkation: Boolean,
    private val satellites: List<Satellite>,
) : HeavenlyBody(name, isAtmosphere, isPossibilityOfDisembarkation) {

    fun printInfoPlanet() {
        println(
            "Небесное тело $name: \n" +
                    "Наличие атмосферы - $isAtmosphere;\n" +
                    "Возможность высадки - $isPossibilityOfDisembarkation;\n" +
                    "Имеет спутники:"
        )
        satellites.forEach {
            println(it.name)
        }
    }
}

class Satellite(
    name: String,
    isAtmosphere: Boolean = false,
    isPossibilityOfDisembarkation: Boolean = false,
) : HeavenlyBody(name, isAtmosphere, isPossibilityOfDisembarkation)

fun main() {
    val satellite1 = Satellite("Фобос")
    val satellite2 = Satellite("Деймос")
    val planet = Planet("Марс", false, false, listOf(satellite1, satellite2))

    planet.printInfoPlanet()
}