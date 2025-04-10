package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model.LogMessage

abstract class BaseLogger : Logger {
    private var currentLogger: Logger? = null

    override fun setNext(logger: Logger): Logger {
        currentLogger = logger
        return logger
    }

    override fun log(logMessage: LogMessage) {
        if (canHandleLog(logMessage)) {
            writeLogMessage(logMessage)
        }
        currentLogger?.log(logMessage) ?: println("No loggers available!")
    }

    abstract fun canHandleLog(logMessage: LogMessage): Boolean
    abstract fun writeLogMessage(logMessage: LogMessage)
}