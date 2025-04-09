package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.approvers

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.BasePurchaseApprover
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.PurchaseRequest

class TeamLead : BasePurchaseApprover() {
    override fun canApprove(purchaseRequest: PurchaseRequest): Boolean =
        purchaseRequest.price <= 300

    override fun processPurchase(purchaseRequest: PurchaseRequest) =
        println("Team Lead Approved This Purchase: ${purchaseRequest.description} \n Price: ${purchaseRequest.price}")
}