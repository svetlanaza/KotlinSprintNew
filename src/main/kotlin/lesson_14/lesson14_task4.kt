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

    ) : HeavenlyBody(name, category) {

    fun printInfoPlanet() {
        println("Небеснное тело $name относися к категории: $category;\n"+
                "Наличие атмосферы - ${isAtmosphere};\n"+
                "Возможнность высадки - ${isPossibilityOfDisembarkation};\n"+
                "Имеет 2 спутника:")

    }
}

class Satellite(
    name: String,
    category: String
) : HeavenlyBody(name, category)

fun main() {
    val planet = Planet("Марс", "Планеты")
    val satellites = listOf(
        Satellite("Фобос", "Спутники"),
        Satellite("Деймос", "Спутники")
    )
    planet.printInfoPlanet()
    satellites.forEach {
        println(it.name)
    }
}

