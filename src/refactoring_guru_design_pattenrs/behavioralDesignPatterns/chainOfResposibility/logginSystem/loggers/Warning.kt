package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.loggers

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.BaseLogger
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogLevel
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogMessage

class Warning : BaseLogger() {
    override fun canHandleLog(logMessage: LogMessage): Boolean =
        logMessage.logLevel == LogLevel.WARNING

    override fun writeLogMessage(logMessage: LogMessage) =
        println("Warning Log message for ${logMessage.logLevel}: ${logMessage.message}")
}