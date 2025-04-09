package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.approvers

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.BasePurchaseApprover
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.PurchaseRequest

class Direcotr : BasePurchaseApprover() {
    override fun canApprove(purchaseRequest: PurchaseRequest): Boolean =
        purchaseRequest.price <= 1000

    override fun approveRequest(purchaseRequest: PurchaseRequest) =
        println("Director Approved This Purchase: ${purchaseRequest.description} \n Price: ${purchaseRequest.price}")
}