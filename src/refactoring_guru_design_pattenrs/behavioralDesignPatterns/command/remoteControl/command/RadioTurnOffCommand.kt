package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.receiver.Radio

class RadioTurnOffCommand(private val radio: Radio) : Command {
    override fun exectute() {
        radio.turnOff()
    }

    override fun undo() {
        radio.trunOn()
    }
}