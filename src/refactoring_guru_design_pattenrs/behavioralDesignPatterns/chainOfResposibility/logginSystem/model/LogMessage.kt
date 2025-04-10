package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.logginSystem.model

data class LogMessage(
    val message: String,
    val logLevel: LogLevel,
)
