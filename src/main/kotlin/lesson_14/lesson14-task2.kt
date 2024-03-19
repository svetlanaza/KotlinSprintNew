package lesson_14

open class Ship(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val tonnage: Int,
) {
    fun printData() {
        println("Корабль $name имеет: " +
                "скорость $speed, " +
                "вместительность $capacity пассажиров, " +
                "грузоподъемность $tonnage.")
    }
}

class Liner1(name: String,
             speed: Int,
             capacity: Int,
             tonnage: Int,
) : Ship(name, speed, capacity, tonnage) {

    fun extendTheLadder() {
        println("Метод погрузки: выдвинуть горизонтальный трап.")
    }
}

class Icebreaker1(
    name: String,
    speed: Int,
    capacity: Int,
    tonnage: Int,
) : Ship(name, speed, capacity, tonnage) {

    fun breakTheIce() {
        println("Может колоть лед.")
    }

    fun openGateTheStern() {
        println("Метод погрузки: открыть ворота на корме.")
    }
}

class Tanker1(name: String,
              speed: Int,
              capacity: Int,
              tonnage: Int,
) : Ship(name, speed, capacity, tonnage) {

    fun activateLoadingCrane() {
        println("Метод погрузки: активировать погрузочный кран.")
    }
}

fun main() {
    val liner = Liner1("Быстрый", 500, 3000, 2000)
    val icebreaker = Icebreaker1("Ленин", 100, 50, 10000)
    val tanker = Tanker1("Адмирал", 200, 100, 20000)

    liner.printData()
    liner.extendTheLadder()
    println()
    icebreaker.printData()
    icebreaker.openGateTheStern()
    icebreaker.breakTheIce()
    println()
    tanker.printData()
    tanker.activateLoadingCrane()

}