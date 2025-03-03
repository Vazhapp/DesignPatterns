package refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.director

import refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.builders.Builder

class Director {
    fun buildPepperoniPizza(builder: Builder) {
        builder.apply {
            applyPizzaSauce(true)
            applyPepperoni(true)
            applyMozzarella(true)
            applyBacon(false)
            applyOnion(false)
        }
    }

    fun buildSupremePizza(builder: Builder) {
        builder.apply {
            applyPizzaSauce(true)
            applyPepperoni(true)
            applyMozzarella(true)
            applyBacon(true)
            applyOnion(true)
        }
    }
}