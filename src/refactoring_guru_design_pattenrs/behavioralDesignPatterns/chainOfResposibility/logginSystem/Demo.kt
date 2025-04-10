package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.loggers.Debug
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.loggers.Error
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.loggers.Info
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.loggers.Warning
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogLevel
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogMessage

fun main() {
    val debugLogger = Debug()
    val errorLogger = Error()
    val warningLogger = Warning()
    val infoLogger = Info()

    debugLogger.setNext(errorLogger)
    errorLogger.setNext(warningLogger)
    warningLogger.setNext(infoLogger)

    val logs = listOf(
        LogMessage("Warning in code", LogLevel.WARNING),
        LogMessage("Error in code", LogLevel.ERROR),
        LogMessage("Info in code", LogLevel.INFO),
        LogMessage("Debug in code", LogLevel.DEBUG),
    )

    logs.forEach { debugLogger.log(it) }
}