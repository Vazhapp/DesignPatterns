package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation

class Message : MessageSender {
    override fun sendMessageViaChannel(channel: MessageChannels) {
        println("Send message via ${channel.name}")
    }
}