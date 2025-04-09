package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support

interface SupportHandler {
    fun setNext(supportHandler: SupportHandler): SupportHandler
    fun handleRequest(request: SupportRequest)
}