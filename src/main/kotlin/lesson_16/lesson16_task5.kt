package lesson_16

class Gamer(
    private val name: String,
    private var health: Int,
    private var impactForce: Int,
) {

    private fun killBill() {
        println("$name убит!")
        return
    }

    fun takeDamage(damage: Int) {
        health -= damage
        impactForce -= 1
        println("Игроку $name нанесен урон, здоровье: $health")
        if (health <= 0)
            killBill()
    }

    fun cure() {
        health += 1
        impactForce += 1
        println("$name получил лечение, здоровье: $health")
    }
}

fun main() {
    val gamer = Gamer(
        name = "Билл",
        health = 10,
        impactForce = 5,
    )

    gamer.takeDamage(7)
    gamer.cure()
    gamer.takeDamage(5)

}