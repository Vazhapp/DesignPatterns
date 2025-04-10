package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.chatRoom

fun main() {
    val chat = ChatRoom()

    val vazha = User("Vazha", chat)
    val murat = User("Murat", chat)

    vazha.sendMessage("Hi Murat!")
    murat.sendMessage("Hi Vazha! wassuppp brooo >.<")
}