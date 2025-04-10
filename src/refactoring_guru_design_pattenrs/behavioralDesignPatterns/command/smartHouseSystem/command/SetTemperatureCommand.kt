package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.receiver.Thermostat

class SetTemperatureCommand(private val thermostat: Thermostat, private val newTemperature: Int) : Command {
    private var previousTemperature: Int = thermostat.getTemperature()

    override fun execute() {
        previousTemperature = thermostat.getTemperature()
        thermostat.setTemperature(temp = newTemperature)
        println("Temperature set to $newTemperature")
    }

    override fun undo() {
        thermostat.setTemperature(temp = previousTemperature)
        println("Temperature set to $previousTemperature")
    }
}