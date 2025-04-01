package refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.abstraction

import refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.implementation.MessageChannels
import refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.implementation.MessageSender

class Email(
    messageSender: MessageSender
) : Notification(messageSender) {
    override fun notify(text: String): String = messageSender.sendMessageViaChannel(MessageChannels.EMAIL)
}