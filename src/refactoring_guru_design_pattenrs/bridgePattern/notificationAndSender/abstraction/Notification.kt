package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.abstraction

import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.MessageSender

abstract class Notification(
    protected val messageSender: MessageSender
) {
    abstract fun notify(text: String): String
}