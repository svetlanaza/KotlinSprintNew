package lesson_10

fun main() {
    println("Ход игрока. Бросайте кости")

    val gamer = diceRoll()
    println("Ваше число: $gamer")
    println("Ход компьютера")

    val computer = diceRoll()
    println("Мое число: $computer")

    if (gamer > computer)
        println("Победило человечество!")
    else if (gamer < computer)
        println("Победила машина!")
    else
        println("Победила дружба!")

}

fun diceRoll(): Int = (1..6).random()
