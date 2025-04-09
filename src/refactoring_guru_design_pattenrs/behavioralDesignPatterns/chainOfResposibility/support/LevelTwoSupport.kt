package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support

class LevelTwoSupport : BaseSupportHandler() {
    override fun canHandle(request: SupportRequest): Boolean =
        request.requestComplexity <= 6

    override fun processRequest(request: SupportRequest) =
        println("Level Two Support Solved Problem: ${request.requestDescription} \n Complexity: ${request.requestComplexity}")
}