package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.restourant

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.FoodRecipe
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.Restourant
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.food.Fxali
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.food.Mtsvadi
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.food.VeggieSalad
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.food.Xarcho

class StandardRestourant : Restourant() {
    override fun getFoodRecpies(): List<FoodRecipe> {
        return listOf(
            Mtsvadi(),
            Xarcho(),
            Fxali(),
            VeggieSalad(),
        )
    }

    fun startFoodPreparing() {
        prepareFood(getFoodRecpies())
    }
}