package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogMessage

interface Logger {
    fun setNext(logger: Logger): Logger
    fun log(logMessage: LogMessage)
}