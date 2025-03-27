package refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.abstraction

import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.MessageChannels
import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.MessageSender

class Discord : Notification() {
    override fun notify(text: String) {
        println("Notify $text")
    }
}