package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support

class LevelOneSupport : BaseSupportHandler() {
    override fun canHandle(request: SupportRequest): Boolean =
        request.requestComplexity <= 3

    override fun processRequest(request: SupportRequest) =
        println("Level One Support Solved Problem: ${request.requestDescription} \n Complexity: ${request.requestComplexity}")
}