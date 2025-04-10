package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.loggers

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.BaseLogger
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogLevel
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogMessage

class Error : BaseLogger() {

    override fun canHandleLog(logMessage: LogMessage): Boolean =
        logMessage.logLevel == LogLevel.ERROR

    override fun writeLogMessage(logMessage: LogMessage) =
        println("Error Log message for ${logMessage.logLevel}: ${logMessage.message}")
}