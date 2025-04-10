package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.command.FanOffCommand
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.command.FanOnCommand
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.command.SetTemperatureCommand
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.receiver.Fan
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.receiver.Thermostat
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.sender_invoker.SmartHomeApp

fun main() {
    // Receivers
    val fan = Fan()
    val thermostat = Thermostat()
    // **********

    // Commands
    val fanOnCommand = FanOnCommand(fan)
    val fanOffCommand = FanOffCommand(fan)
    val setTemperatureCommand = SetTemperatureCommand(thermostat, 29)
    // **********

    // Sender(invoker)
    val smartHomeApp = SmartHomeApp()

    smartHomeApp.executeCommand(fanOnCommand)
    smartHomeApp.executeCommand(setTemperatureCommand)
    smartHomeApp.undoLastCommand()
}