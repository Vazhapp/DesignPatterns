package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command

interface Command {
    fun exectute()
    fun undo()
}