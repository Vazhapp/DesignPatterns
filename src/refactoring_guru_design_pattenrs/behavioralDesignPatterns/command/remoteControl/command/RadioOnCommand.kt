package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.receiver.Radio

class RadioOnCommand(private val radio: Radio) : Command {
    override fun exectute() {
        radio.trunOn()
    }

    override fun undo() {
        radio.turnOff()
    }
}