package refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.implementation

interface MessageSender {
    fun sendMessageViaChannel(channel: MessageChannels): String
}