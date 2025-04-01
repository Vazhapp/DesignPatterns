package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.restourant.StandardRestourant
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator.restourant.VegetarianRestourant

// Factory Method Pattern
fun main() {
    val standardRestourant = StandardRestourant()
    val vegetarianRestourant = VegetarianRestourant()

    vegetarianRestourant.startFoodPreparing()
//    standardRestourant.startFoodPreparing()
}