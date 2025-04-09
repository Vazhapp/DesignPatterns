package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.approvers

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.BasePurchaseApprover
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.PurchaseRequest

class Manager : BasePurchaseApprover() {
    override fun canApprove(purchaseRequest: PurchaseRequest): Boolean =
        purchaseRequest.price <= 100

    override fun approveRequest(purchaseRequest: PurchaseRequest) =
        println("Manager Approved This Purchase: ${purchaseRequest.description} \n Price: ${purchaseRequest.price}")
}