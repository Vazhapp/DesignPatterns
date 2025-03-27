package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.abstraction

class Message : Notification() {
    override fun notify(text: String) {
        println("Notify $text")
    }
}