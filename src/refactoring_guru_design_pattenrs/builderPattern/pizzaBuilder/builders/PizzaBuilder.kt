package refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.builders

import refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.models.Pizza

class PizzaBuilder : Builder {
    private var isPizzaSouceApplied: Boolean = false
    private var isPepperoniApplied: Boolean = false
    private var isMozzarellaApplied: Boolean = false
    private var isBaconApplied: Boolean = false
    private var isOnionApplied: Boolean = false

    override fun applyPizzaSauce(apply: Boolean) {
        isPizzaSouceApplied = apply
    }

    override fun applyPepperoni(apply: Boolean) {
        isPepperoniApplied = apply
    }

    override fun applyMozzarella(apply: Boolean) {
        isMozzarellaApplied = apply
    }

    override fun applyBacon(apply: Boolean) {
        isBaconApplied = apply
    }

    override fun applyOnion(apply: Boolean) {
        isOnionApplied = apply
    }

    val bakedPizza
        get() = Pizza(
            pizzaSauce = isPizzaSouceApplied,
            pepperoni = isPepperoniApplied,
            mozzarella = isMozzarellaApplied,
            bacon = isBaconApplied,
            onion = isOnionApplied
        )
}