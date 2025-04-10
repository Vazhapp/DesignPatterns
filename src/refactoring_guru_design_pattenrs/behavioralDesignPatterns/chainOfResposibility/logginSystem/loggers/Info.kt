package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.loggers

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.BaseLogger
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogLevel
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogMessage

class Info : BaseLogger() {
    override fun canHandleLog(logMessage: LogMessage): Boolean =
        logMessage.logLevel == LogLevel.INFO

    override fun writeLogMessage(logMessage: LogMessage) =
        println("Info Log message for ${logMessage.logLevel}: ${logMessage.message}")
}