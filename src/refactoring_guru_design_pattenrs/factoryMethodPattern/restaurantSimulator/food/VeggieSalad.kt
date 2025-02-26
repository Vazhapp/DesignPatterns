package refactoring_guru_design_pattenrs.factoryMethodPattern.restaurantSimulator.food

import refactoring_guru_design_pattenrs.factoryMethodPattern.restaurantSimulator.FoodRecipe

class VeggieSalad : FoodRecipe {
    override fun cookWithRecipe() {
        println("Yvela bostneuli chacheri da dauamte dzmari")
    }
}