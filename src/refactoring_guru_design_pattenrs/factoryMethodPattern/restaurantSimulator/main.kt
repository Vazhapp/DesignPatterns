package refactoring_guru_design_pattenrs.factoryMethodPattern.restaurantSimulator

import refactoring_guru_design_pattenrs.factoryMethodPattern.restaurantSimulator.restourant.StandardRestourant
import refactoring_guru_design_pattenrs.factoryMethodPattern.restaurantSimulator.restourant.VegetarianRestourant

// Factory Method Pattern
fun main() {
    val standardRestourant = StandardRestourant()
    val vegetarianRestourant = VegetarianRestourant()

    vegetarianRestourant.startFoodPreparing()
//    standardRestourant.startFoodPreparing()
}