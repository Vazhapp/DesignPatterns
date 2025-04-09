package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support

class LeveThreeSupport : BaseSupportHandler() {
    override fun canHandle(request: SupportRequest): Boolean =
        request.requestComplexity <= 10

    override fun processRequest(request: SupportRequest) =
        println("Level Three Support Solved Problem: ${request.requestDescription} \n Complexity: ${request.requestComplexity}")
}