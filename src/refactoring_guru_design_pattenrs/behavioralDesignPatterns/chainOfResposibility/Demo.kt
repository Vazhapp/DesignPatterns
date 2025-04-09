package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.PurchaseRequest
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.approvers.Direcotr
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.approvers.Manager
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.purchaseApproval.approvers.TeamLead
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support.LeveThreeSupport
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support.LevelOneSupport
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support.LevelTwoSupport
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support.SupportRequest

fun main() {
//    val levelOneSupport = LevelOneSupport()
//    val levelTwoSupport = LevelTwoSupport()
//    val levelThreeSupport = LeveThreeSupport()
//
//    levelOneSupport.setNext(levelTwoSupport).setNext(levelThreeSupport)
//
//    val supportRequests = listOf(
//        SupportRequest("Printer not working", 2),
//        SupportRequest("Wi-Fi is slow", 5),
//        SupportRequest("Server crashed", 9),
//        SupportRequest("AI takeover imminent", 12)
//    )
//
//    supportRequests.forEach { request ->
//        println("Processing ${request.requestDescription} Complexity: ${request.requestComplexity}")
//        levelOneSupport.handleRequest(request)
//    }

    val manager = Manager()
    val teamLead = TeamLead()
    val director = Direcotr()
    manager.setNext(teamLead).setNext(director)

    val purchases = listOf(
        PurchaseRequest(
            price = 80,
            description = "Brake Pads"
        ),
        PurchaseRequest(
            price = 200,
            description = "Engine"
        ),
        PurchaseRequest(
            price = 360,
            description = "Steering Wheel"
        ),
        PurchaseRequest(
            price = 630,
            description = "Gearbox"
        ),
        PurchaseRequest(
            price = 1200,
            description = "Doors"
        ),
    )

    purchases.forEach { purchase ->
        println("Processing Purhcase: ${purchase.description} | Price: ${purchase.price}")
        manager.handlePurchase(purchase)
    }
}