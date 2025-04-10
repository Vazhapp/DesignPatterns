package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.command

interface Command {
    fun execute()
    fun undo()
}