package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.receiver.Bar
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.receiver.HotDrink

class PrepareCoffeeCommand(private val bar: Bar) : Command {
    override fun execute() {
        bar.prepareHotDrinks(hotDrink = HotDrink.COFFEE)
    }
}