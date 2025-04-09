package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval

interface PurchaseApprover {
    fun setNext(purchaseApprover: PurchaseApprover): PurchaseApprover
    fun processRequest(purchaseRequest: PurchaseRequest)
}