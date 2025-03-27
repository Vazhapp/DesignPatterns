package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation

class APISender : MessageSender {
    override fun sendMessageViaChannel(channel: MessageChannels): String = "Send message via ${channel.name}"
}