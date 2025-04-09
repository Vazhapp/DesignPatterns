package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval

abstract class BasePurchaseApprover : PurchaseApprover {
    private var nextHandler: PurchaseApprover? = null

    override fun setNext(purchaseApprover: PurchaseApprover): PurchaseApprover {
        nextHandler = purchaseApprover
        return purchaseApprover
    }

    override fun processRequest(purchaseRequest: PurchaseRequest) {
        if (canApprove(purchaseRequest))
            approveRequest(purchaseRequest)
        else
            nextHandler?.processRequest(purchaseRequest) ?: println("This purchase can't be approved")
    }

    abstract fun canApprove(purchaseRequest: PurchaseRequest): Boolean
    abstract fun approveRequest(purchaseRequest: PurchaseRequest)
}