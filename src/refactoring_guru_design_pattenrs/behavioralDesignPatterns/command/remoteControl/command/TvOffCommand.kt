package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.receiver.TV

class TvOffCommand(private val tv: TV) : Command {
    override fun exectute() {
        tv.turnOff()
    }

    override fun undo() {
        tv.trunOn()
    }
}