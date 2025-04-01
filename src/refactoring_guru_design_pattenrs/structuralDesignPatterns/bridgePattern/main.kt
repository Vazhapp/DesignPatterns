package refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern

import refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.abstraction.Slack
import refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.implementation.APISender
import refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.notificationAndSender.implementation.MessageSender

fun main() {
    /**
     *     val tv = TV()
     *     val radio = Radio()
     *
     *     val standardRemote = StandardRemote(tv)
     *
     *     standardRemote.powerOn()
     *     standardRemote.volumeUp()
     *     standardRemote.volumeUp()
     *     standardRemote.volumeUp()
     *     tv.getStatus()
     *
     *     val standardRadioRemote = StandardRemote(radio)
     *     standardRadioRemote.powerOn()
     *     standardRadioRemote.volumeUp()
     *     standardRadioRemote.volumeUp()
     *     standardRadioRemote.channelNext()
     *     standardRadioRemote.channelNext()
     *     standardRadioRemote.channelNext()
     *     standardRadioRemote.channelNext()
     *     radio.getStatus()
     */

    val sender: MessageSender = APISender()

    val slack = Slack(sender)
    println(slack.notify("Sent Test Message via Slack"))
}