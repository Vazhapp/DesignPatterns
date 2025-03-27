package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.abstraction

import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.MessageChannels
import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.MessageSender

class Slack(
    messageSender: MessageSender
) : Notification(messageSender) {
    override fun notify(text: String): String = messageSender.sendMessageViaChannel(MessageChannels.SLACK)
}