package lesson_18

abstract class Animal(
    private val name: String,
    private val food: String,
    private val rest: Boolean = false,
) {

    fun eat() {
        println("$name $food")
    }

    fun toRest() {
        if (rest) {
            println("$name идет спать.")
        }
    }
}

class Fox() : Animal("Лиса Алиса", "ест ягоды.")

class Cat() : Animal("Кот Базилио", "ест рыбу.")

class Dog() : Animal("Собака Рэкс", "грызет кости.", true)

fun main() {
    val fox = Fox()
    val cat = Cat()
    val dog = Dog()

    val listAnimals: List<Animal> = listOf(fox, cat, dog)

    listAnimals.forEach {
        it.eat()
    }

    dog.toRest()
}