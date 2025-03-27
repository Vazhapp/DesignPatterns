package refactoring_guru_design_pattenrs.bridgePattern

import refactoring_guru_design_pattenrs.bridgePattern.devices.Radio
import refactoring_guru_design_pattenrs.bridgePattern.devices.TV
import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.abstraction.Slack
import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.APISender
import refactoring_guru_design_pattenrs.bridgePattern.notificationAndSender.implementation.MessageSender
import refactoring_guru_design_pattenrs.bridgePattern.remotes.StandardRemote

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