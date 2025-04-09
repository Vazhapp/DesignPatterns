package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.command.*
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.receiver.Bar
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.receiver.Kitchen
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.sender_invoker.Waiter

fun main() {
    val kitchen = Kitchen()
    val bar = Bar()

    val khinkaliCommand = PrepareKhinkaliCommand(kitchen)
    val chaqafuliCommand = PrepareChaqafuliCommand(kitchen)
    val tolmaCommand = PrepareTolmaCommand(kitchen)
    val khachapuriCommand = BakeKhachapuriCommand(kitchen)

    val sisxlianiMeriCommad = PrepareSisxlianiMeriCommad(bar)
    val myvintaviCommand = PrepareMyvintaviCommand(bar)
    val coffeeCommand = PrepareCoffeeCommand(bar)
    val teaCommand = PrepareTeaCommand(bar)

    val waiter = Waiter()

    waiter.placeOrder(command = khinkaliCommand)
    waiter.placeOrder(command = chaqafuliCommand)
    waiter.placeOrder(command = tolmaCommand)
    waiter.placeOrder(command = khachapuriCommand)

    waiter.placeOrder(command = coffeeCommand)
}