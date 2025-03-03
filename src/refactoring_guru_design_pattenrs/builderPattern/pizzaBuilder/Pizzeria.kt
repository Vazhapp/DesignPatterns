package refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder

import refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.builders.PizzaBuilder
import refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.director.Director
import refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.models.Pizza

class Pizzeria {
    private val pizzaBuilder = PizzaBuilder()
    private val director: Director = Director()

    fun bakePizzaWithDirector(bakePepperoni: Boolean): Pizza {
        return if (bakePepperoni) {
            director.buildPepperoniPizza(builder = pizzaBuilder)
            pizzaBuilder.bakedPizza
        } else {
            director.buildSupremePizza(builder = pizzaBuilder)
            pizzaBuilder.bakedPizza
        }
    }

    fun bakePizzaWithBuilder(bakePepperoni: Boolean): Pizza {
        return if (bakePepperoni) {
            pizzaBuilder.apply {
                applyPizzaSauce(true)
                applyMozzarella(true)
                applyPepperoni(true)
                applyBacon(false)
                applyOnion(false)
            }.bakedPizza
        } else {
            pizzaBuilder.apply {
                applyPizzaSauce(true)
                applyMozzarella(true)
                applyPepperoni(true)
                applyBacon(true)
                applyOnion(true)
            }.bakedPizza
        }
    }
}