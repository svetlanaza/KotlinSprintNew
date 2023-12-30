package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {

}

fun main() {
    val user1 = User(
        id = 1,
        login = "qwerty72",
        password = "kat72",
        email = "qwerty72@com",
    )
    val user2 = User(
        id = 2,
        login = "asty11",
        password = "dog11",
        email = "asty11@com",
        )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}