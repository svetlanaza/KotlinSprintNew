package lesson_10

fun main() {
    var wonGame = 0

    do {
        println("Ход игрока. Бросайте кости")

        val gamer = throwDice()
        println("Ваше число: $gamer")
        println()
        println("Ход компьютера.")

        val computer = throwDice()
        println("Число компьютера: $computer")
        println()

        when {
            gamer > computer -> {
                println("Победило человечество")
                wonGame++
            }
            gamer < computer -> println("Победила машина")
            else -> println("Победила дружба")
        }

    } while (continueGame())
    println("Количество выигранных партий: $wonGame")

}

fun throwDice(): Int = (1..6).random()

fun continueGame(): Boolean {
    println("Хотите поиграть еще?")
    val answer = readln()
    return answer.equals("Да", ignoreCase = true)

}