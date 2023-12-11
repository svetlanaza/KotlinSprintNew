package lesson_8

fun main() {
    var arrayOfIngredients = arrayOf("апельсин", "имбирь", "сахар", "корица")

    println(arrayOfIngredients[0])
    println(arrayOfIngredients[1])
    println(arrayOfIngredients[2])
    println(arrayOfIngredients[3])
    println()

    println("Какой ингредиент вы хотите заменить?")

    val ingredient = readln()

    if (ingredient in arrayOfIngredients) {
        val index = arrayOfIngredients.indexOf(ingredient)
        println("Какой ингредиент вы хотите добавить?")

        val ingredientNew = readln()
        arrayOfIngredients.set(index, ingredientNew)
        arrayOfIngredients.get(index)
    } else {

        println("Такого ингредиента в рецепте нет")
        return
    }
    println("Ваш новый рецепт:")
    println(arrayOfIngredients[0])
    println(arrayOfIngredients[1])
    println(arrayOfIngredients[2])
    println(arrayOfIngredients[3])


}