package lesson_14

open class Ship(
    open val name: String,
    open val speed: Int,
    open val capacity: Int,
    open val tonnage: Int,
)

class Liner(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
    override val tonnage: Int,
) : Ship(name = "Быстрый", speed  = 500, capacity = 3000, tonnage  = 2000)

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
    tonnage: Int,
) : Ship(name, speed, capacity, tonnage) {

    fun breakTheIce() {
        println("Может колоть лед")
    }
}

class Tanker(name: String,
             speed: Int,
             capacity: Int,
             tonnage: Int,
) : Ship(name, speed, capacity, tonnage)

fun main() {
    val liner = Liner("Океан", 300, 200, 5000)
    val icebreaker = Icebreaker("Ленин", 100, 50, 10000)
    val tanker = Tanker("Адмирал", 200, 100, 20000)

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