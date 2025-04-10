package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.chatRoom

// Colleague
open class User(val name: String, protected val chatMediator: ChatRoom) {
    open fun sendMessage(message: String) {
        chatMediator.showMessage(this, message)
    }
}