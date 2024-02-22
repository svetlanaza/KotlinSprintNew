package lesson_11

class Participant(
    val nickname: String,
    val avatar: String,
    var status: String,
)
class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<Participant> = mutableListOf(),
) {
    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateParticipantStatus(nickname: String, newStatus: String) {

    }

    fun printParticipantInfo(nickname: String, status: String) {
            println("Nickname: $nickname, Status: $status")
        }
    }


fun main() {
    val room = Room(
        cover = "cover_image.jpg",
        title = "Комната любителей Kotlin"
    )
    room.addParticipant(Participant(nickname = "User1", avatar = "avatar1.jpg", status = "разговаривает"))
    room.addParticipant(Participant(nickname = "User2", avatar = "avatar2.jpg", status = "микрофон выключен"))
    room.updateParticipantStatus(nickname = "User2", newStatus = "пользователь заглушен")
    room.printParticipantInfo(nickname = "User2", status = "пользователь заглушен")

    println("Комната: ${room.title}")
    room.participants.forEach {
        println("Участник: ${it.nickname}, Статус: ${it.status}")
    }
}