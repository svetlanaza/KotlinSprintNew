package lesson_14

open class Ship(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val tonnage: Int,
)

class Liner(
    name: String,
    speed: Int = 150,
    capacity: Int = 1000,
    tonnage: Int = 15000,
) : Ship(name, speed, capacity, tonnage)

class Icebreaker(
    name: String,
    speed: Int = 100,
    capacity: Int = 200,
    tonnage: Int = 10000,
) : Ship(name, speed, capacity, tonnage) {

    fun breakTheIce() {
        println("Может колоть лед")
    }
}

class Tanker(name: String,
             speed: Int = 50,
             capacity: Int = 500,
             tonnage: Int = 30000,
) : Ship(name, speed, capacity, tonnage)

fun main() {
    val liner = Liner("Быстрый")
    val icebreaker = Icebreaker("Ленин")
    val tanker = Tanker("Адмирал")

    println("Корабль ${liner.name} имеет: " +
            "скорость ${liner.speed}, " +
            "вместительность ${liner.capacity} пассажиров, " +
            "грузоподъемность ${liner.tonnage}.")
    println()
    println("Корабль ${icebreaker.name} имеет: " +
            "скорость ${icebreaker.speed}, " +
            "вместительность ${icebreaker.capacity} человек экипажа, " +
            "грузоподъемность ${icebreaker.tonnage}.")

    icebreaker.breakTheIce()
    println()
    println("Корабль ${tanker.name} имеет: " +
            "скорость ${tanker.speed}, " +
            "вместительность ${tanker.capacity} человек экипажа, " +
            "грузоподъемность ${tanker.tonnage}.")
}