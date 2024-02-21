package lesson_11

class Participants(
    val nickname: String,
    val avatar: String,
    var status: String,
)
class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<Participants> = mutableListOf(),
) {
    fun addParticipant(participant: Participants) {
        participants.add(participant)
    }

    fun updateParticipantStatus(nickname: String, newStatus: String) {
        participants.find { it.nickname == nickname }?.status = newStatus
    }

    fun printParticipantInfo(nickname: String) {
        participants.find { it.nickname == nickname }?.let {
            println("Nickname: ${it.nickname}, Status: ${it.status}")
        }
    }
}

fun main() {
    val room = Room(
        cover = "cover_image.jpg",
        title = "Комната любителей Kotlin"
    )
    room.addParticipant(Participants(nickname = "User1", avatar = "avatar1.jpg", status = "разговаривает"))
    room.addParticipant(Participants(nickname = "User2", avatar = "avatar2.jpg", status = "микрофон выключен"))

    room.updateParticipantStatus(nickname = "User2", newStatus = "пользователь заглушен")

    room.printParticipantInfo(nickname = "User2")

    println("Комната: ${room.title}")
    room.participants.forEach {
        println("Участник: ${it.nickname}, Статус: ${it.status}")
    }
}