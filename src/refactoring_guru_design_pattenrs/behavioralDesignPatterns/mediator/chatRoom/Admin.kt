package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.chatRoom

class Admin(name: String, chatMediator: ChatRoom) : User(name, chatMediator) {
    fun muteUser(user: User) {
        chatMediator.muteUser(user)
    }

    fun unmuteUser(user: User) {
        chatMediator.unmuteUser(user)
    }

    override fun sendMessage(message: String) {
        chatMediator.showMessage(this, "[Admin] $message")
    }
}