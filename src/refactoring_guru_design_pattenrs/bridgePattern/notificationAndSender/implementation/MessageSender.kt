package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation

interface MessageSender {
    fun sendMessageViaChannel(channel: MessageChannels)
}