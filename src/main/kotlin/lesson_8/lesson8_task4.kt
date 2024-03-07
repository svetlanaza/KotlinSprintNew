package lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("апельсин", "имбирь", "сахар", "корица")
    println("В рецепте есть базовые ингредиенты:")
    arrayOfIngredients.forEach {
        println(it)
    }

    println("Какой ингредиент вы хотите заменить?")

    val ingredient = readln()
    val index = arrayOfIngredients.indexOf(ingredient)
    if (index == -1) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("Какой ингредиент вы хотите добавить?")
    }
    val ingredientNew = readln()
    arrayOfIngredients[index] = ingredientNew

    println("Ваш новый рецепт:")
    arrayOfIngredients.forEach {
        println(it)
    }
}