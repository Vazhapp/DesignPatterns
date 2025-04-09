package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.sender_invoker

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command.Command

class RemoteControl {
    private val commandHistory = mutableListOf<Command>()

    fun executeCommand(command: Command) {
        command.exectute()
        commandHistory.add(command)
    }

    fun undoLastCommand() {
        if (commandHistory.isNotEmpty()) {
            val lastCommand = commandHistory[commandHistory.size - 1]
            lastCommand.undo()
        } else {
            println("No commands to undo")
        }
    }
}