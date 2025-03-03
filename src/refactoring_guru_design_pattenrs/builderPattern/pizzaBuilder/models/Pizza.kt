package refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.models

data class Pizza(
    val pizzaSauce: Boolean,
    val pepperoni: Boolean,
    val mozzarella: Boolean,
    val bacon: Boolean,
    val onion: Boolean,
)