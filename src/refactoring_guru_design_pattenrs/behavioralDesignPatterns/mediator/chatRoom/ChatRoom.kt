package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.chatRoom

import java.time.LocalTime

// Mediator
class ChatRoom {
    private val mutedUsers = mutableSetOf<User>()

    fun showMessage(user: User, message: String) {
        val time = LocalTime.now().toString()
        if (user in mutedUsers) {
            println("${user.name}: (muted)")
        } else {
            println("$time [${user.name}]: $message")
        }
    }

    fun muteUser(user: User) {
        if (user !is Admin && user !in mutedUsers) {
            println(user.name + " was muted")
            mutedUsers.add(user)
        } else {
            println("User can't be muted or already muted")
        }
    }

    fun unmuteUser(user: User) {
        if (user in mutedUsers) {
            println(user.name + " was unmuted")
            mutedUsers.remove(user)
        } else {
            println("User can't be unmuted")
        }
    }
}