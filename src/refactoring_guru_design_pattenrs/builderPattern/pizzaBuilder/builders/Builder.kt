package refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.builders

interface Builder {
    fun applyPizzaSauce(apply: Boolean)
    fun applyPepperoni(apply: Boolean)
    fun applyMozzarella(apply: Boolean)
    fun applyBacon(apply: Boolean)
    fun applyOnion(apply: Boolean)
}