package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.receiver.Fan

class FanOnCommand(private val fan: Fan) : Command {
    override fun execute() {
        fan.turnOn()
    }

    override fun undo() {
        fan.turnOff()
    }
}