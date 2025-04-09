package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.command

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.receiver.Dish
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.receiver.Kitchen

class PrepareTolmaCommand(private val kitchen: Kitchen) : Command {
    override fun execute() {
        kitchen.prepareDish(Dish.TOLMA_VAZIS_FOTLIT)
    }
}