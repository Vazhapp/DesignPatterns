package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.abstraction

abstract class Notification {
    abstract fun notify(text: String)
}