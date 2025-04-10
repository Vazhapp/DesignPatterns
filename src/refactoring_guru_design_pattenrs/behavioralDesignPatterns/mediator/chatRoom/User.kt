package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.chatRoom

// Colleague
class User(val name: String, private val chatMediator: ChatRoom) {
    fun sendMessage(message: String) {
        chatMediator.showMessage(this, message)
    }
}