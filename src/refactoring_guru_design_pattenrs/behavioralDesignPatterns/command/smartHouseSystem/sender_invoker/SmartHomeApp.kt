package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.sender_invoker

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.command.Command

class SmartHomeApp {
    private var lastCommand: Command? = null

    fun executeCommand(command: Command) {
        command.execute()
        lastCommand = command
    }

    fun undoLastCommand() {
        lastCommand?.undo() ?: println("No commands to undo")
    }
}