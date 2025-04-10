package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.receiver.Fan

class FanOffCommand(private val fan: Fan) : Command {
    override fun execute() {
        fan.turnOff()
    }

    override fun undo() {
        fan.turnOn()
    }
}