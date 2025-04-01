package refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.abstraction

import refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.implementation.MessageSender

abstract class Notification(
    protected val messageSender: MessageSender
) {
    abstract fun notify(text: String): String
}