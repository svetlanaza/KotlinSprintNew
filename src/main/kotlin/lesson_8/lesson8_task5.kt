package lesson_8

fun main() {
    println("Сколько ингредиентов будет в вашемм блюде?")

    val numberIngredients = readln().toInt()
    val ingredients = Array(numberIngredients) { "" }

    for (i in ingredients.indices) {
        print("Введите ингредиент №${i + 1}: ")
        ingredients[i] = readln()
    }
    println("Список ингредиентов для вашего блюда: ${ingredients.joinToString()}")
}

