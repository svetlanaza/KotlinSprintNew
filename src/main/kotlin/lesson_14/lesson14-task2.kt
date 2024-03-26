package lesson_14

open class Ship1(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val tonnage: Int,
) {
    fun printData() {
        println(
            "Корабль $name имеет: " +
                    "скорость $speed, " +
                    "вместительность $capacity пассажиров, " +
                    "грузоподъемность $tonnage."
        )
    }

    open fun loadMethod() {
        println("$name: выдвигает горизонтальный трап со шкафута")
    }
}

class Liner1(
    name: String,
    speed: Int = 150,
    capacity: Int = 2000,
    tonnage: Int = 15000,
) : Ship1(name, speed, capacity, tonnage)

class Icebreaker1(
    name: String,
    speed: Int = 50,
    capacity: Int = 100,
    tonnage: Int = 10000,
) : Ship1(name, speed, capacity, tonnage) {

    fun breakTheIce() {
        println("Может колоть лед.")
    }

    override fun loadMethod() {
        println("$name: открывает ворота со стороны кормы.")
    }
}

class Tanker1(
    name: String,
    speed: Int = 30,
    capacity: Int = 150,
    tonnage: Int = 30000,
) : Ship1(name, speed, capacity, tonnage) {

    override fun loadMethod() {
        println("$name: активирует погрузочный кран.")
    }
}

fun main() {
    val liner = Liner1("Быстрый")
    val icebreaker = Icebreaker1("Ленин")
    val tanker = Tanker1("Адмирал")

    liner.printData()
    liner.loadMethod()
    println()
    icebreaker.printData()
    icebreaker.loadMethod()
    icebreaker.breakTheIce()
    println()
    tanker.printData()
    tanker.loadMethod()
}

