package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.chatRoom

fun main() {
    val chat = ChatRoom()

    val vazha = User("Vazha", chat)
    val murat = User("Murat", chat)

    val admin = Admin("Admin", chat)

    vazha.sendMessage("Hi Murat!")
    murat.sendMessage("Hi Vazha! wassuppp brooo >.<")
    vazha.sendMessage("Fuck you Murat!")

    admin.muteUser(vazha)
    admin.sendMessage("Hi All! And Bye Vazha")
    vazha.sendMessage("Still muted? :(((")
}