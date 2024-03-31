package lesson_15

abstract class Member(val name: String) {

    fun writeMessage() {
        println("$name пишет сообщение")
    }

    fun readMessage() {
        println("$name читает сообщение")
    }
}

class RegularUser(name: String) : Member(name)

class Administrator(name: String) : Member(name) {

    fun deleteMessage(user: String) {
        println("$name удалил сообшение пользователя $user")
    }

    fun deleteUser(user: String) {
        println("$name удалил пользователя $user")
    }

}

fun main() {
    val user1 = RegularUser("Алекс")
    user1.writeMessage()

    val user2 = RegularUser("Макс")
    user2.readMessage()

    val admin = Administrator("Николай")
    admin.deleteMessage("Алекс")
    admin.deleteUser("Алекс")
}