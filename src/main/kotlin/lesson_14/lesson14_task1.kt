package lesson_14

open class Liner(
    val name: String,
    val speed: Int,
    val capacity: Int,
    val tonnage: Int,
)

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
    tonnage: Int,
) : Liner(name, speed, capacity, tonnage) {

    fun breakTheIce() {
        println("Может колоть лед")
    }
}

class Tanker(name: String,
             speed: Int,
             capacity: Int,
             tonnage: Int,
) : Liner(name, speed, capacity, tonnage)

fun main() {
    val liner = Liner("Быстрый", 500, 3000, 2000)
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