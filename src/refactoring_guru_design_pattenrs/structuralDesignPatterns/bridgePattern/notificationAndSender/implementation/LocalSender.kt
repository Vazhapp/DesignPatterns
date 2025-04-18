package refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.implementation

class LocalSender : MessageSender {
    override fun sendMessageViaChannel(channel: MessageChannels): String = "Send message via ${channel.name}"
}