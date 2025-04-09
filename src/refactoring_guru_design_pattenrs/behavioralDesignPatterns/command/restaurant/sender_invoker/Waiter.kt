package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.sender_invoker

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.command.Command

class Waiter {
    private val orderHistory = mutableListOf<Command>()

    fun placeOrder(command: Command) {
        command.execute()
        orderHistory.add(command)
    }

    fun orderEverythingAgain() = orderHistory.forEach {
        println("Ordering AGAIN")
        it.execute()
    }
}