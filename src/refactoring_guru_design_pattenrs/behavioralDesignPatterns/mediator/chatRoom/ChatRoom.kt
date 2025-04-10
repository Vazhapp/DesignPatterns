package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.chatRoom

import java.time.LocalTime

// Mediator
class ChatRoom {
    fun showMessage(user: User, message: String) {
        val time = LocalTime.now().toString()
        println("$time [${user.name}]: $message")
    }
}