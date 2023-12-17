package lesson_9

fun main() {
    val mutableListIngredients = mutableListOf("огурец", "помидор", "зелень")
    println("В рецепте есть базовые ингредиенты: $mutableListIngredients")
    println("Желаете добавить еще?")

    val answer = readln()
    if (answer == "Да")
        println("Какой ингредиент вы хотите добавить?")
    else
        return
    val ingredientNew = readln()

    mutableListIngredients.add(ingredientNew)
    println("Теперь в рецепте есть следующие ингредиенты: $mutableListIngredients")
}
