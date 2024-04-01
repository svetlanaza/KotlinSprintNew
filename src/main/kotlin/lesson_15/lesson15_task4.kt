package lesson_15

abstract class Product(val name: String, val quantity: Int) : Searchable

interface Searchable {

    fun searchComponents() {
        println("Введите название инструмента")
        println("Выполняется поиск комплектующих для инструмента ${readln()}")
    }
}

class Instrumental(name: String, quantity: Int) : Product(name, quantity)

class Component(name: String, quantity: Int) : Product(name, quantity)

fun main() {
    val instrumental = Instrumental("Гитара", 10)
    val component = Component("Струны", 250)
    instrumental.searchComponents()

}