package refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support.LeveThreeSupport
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support.LevelOneSupport
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support.LevelTwoSupport
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.chainOfResposibility.support.SupportRequest

fun main() {
    val levelOneSupport = LevelOneSupport()
    val levelTwoSupport = LevelTwoSupport()
    val levelThreeSupport = LeveThreeSupport()

    levelOneSupport.setNext(levelTwoSupport).setNext(levelThreeSupport)

    val supportRequests = listOf(
        SupportRequest("Printer not working", 2),
        SupportRequest("Wi-Fi is slow", 5),
        SupportRequest("Server crashed", 9),
        SupportRequest("AI takeover imminent", 12)
    )

    supportRequests.forEach { request ->
        println("Processing ${request.requestDescription} Complexity: ${request.requestComplexity}")
        levelOneSupport.handleRequest(request)
    }
}