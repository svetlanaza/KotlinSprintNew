package lesson_17

class Ship22(var port: String, var speed: Int) {
    var name = "Султан"
        set(value) {
            println("Нельзя поменять имя!")
        }
}

fun main() {
    val ship = Ship22( port = "Стамбул", speed = 140)
    ship.name = "Гроза"
    println(ship.name)
    ship.speed = 150
    println(ship.speed)
    ship.port = "Сочи"
    println(ship.port)


}
