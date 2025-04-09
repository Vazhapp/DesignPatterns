package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.receiver.TV

class TvOnCommand(private val tv: TV) : Command {
    override fun exectute() {
        tv.trunOn()
    }

    override fun undo() {
        tv.turnOff()
    }
}