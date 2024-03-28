package lesson_14

open class HeavenlyBody(
    val name: String,
    val category: String,
)

class Planet(
    name: String,
    category: String,
    val isAtmosphere: Boolean = false,
    val isPossibilityOfDisembarkation: Boolean = false,
    val satellites: List<Satellite>,
    ) : HeavenlyBody(name, category) {

    fun printInfoPlanet() {
        println(
            "Небеснное тело $name относися к категории: $category;\n" +
                    "Наличие атмосферы - ${isAtmosphere};\n" +
                    "Возможнность высадки - ${isPossibilityOfDisembarkation};\n" +
                    "Имеет 2 спутника:"

        )
        satellites.forEach {
            println(it.name)
    }
}

class Satellite(
    name: String,
    category: String,
) : HeavenlyBody(name, category)

fun main() {
    val satellite1 = Satellite("Фобос", "Спутники")
    val satellite2 = Satellite("Деймос", "Спутники")
    val planet = Planet("Марс", "Планеты", false,
        false, listOf(satellite1,satellite2))

    
    planet.printInfoPlanet()

    }
}

