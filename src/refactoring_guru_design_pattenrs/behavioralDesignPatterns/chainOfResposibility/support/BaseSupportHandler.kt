package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support

abstract class BaseSupportHandler : SupportHandler {
    private var nextHandler: SupportHandler? = null

    override fun setNext(supportHandler: SupportHandler): SupportHandler {
        nextHandler = supportHandler
        return supportHandler
    }

    override fun handleRequest(request: SupportRequest) {
        if (canHandle(request)) {
            processRequest(request)
        } else {
            nextHandler?.handleRequest(request)
                ?: println("No handler available to resolve: ${request.requestDescription}")
        }
    }

    abstract fun canHandle(request: SupportRequest): Boolean
    abstract fun processRequest(request: SupportRequest)
}