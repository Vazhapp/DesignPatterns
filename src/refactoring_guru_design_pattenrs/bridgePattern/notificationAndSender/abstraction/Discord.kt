package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.abstraction

class Discord : Notification() {
    override fun notify(text: String) {
        println("Notify $text")
    }
}