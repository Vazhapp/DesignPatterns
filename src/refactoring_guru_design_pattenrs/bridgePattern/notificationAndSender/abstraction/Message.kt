package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.abstraction

import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.MessageChannels
import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.MessageSender

class Message(
    messageSender: MessageSender
) : Notification(messageSender) {
    override fun notify(text: String) = messageSender.sendMessageViaChannel(MessageChannels.MESSAGE)
}