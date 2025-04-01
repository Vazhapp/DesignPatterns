package refactoring_guru_design_pattenrs.creationalDesignPatterns.builderPattern.pizzaBuilder

class Pizza private constructor(
    val tomato: Boolean,
    val mushroom: Boolean,
    val mozarella: Boolean,
    val pepperoni: Boolean,
) {
    class Builder {
        private var tomato = true
        private var mushroom = false
        private var mozarella = true
        private var pepperoni = false

        fun setTomato(tomato: Boolean) = apply { this.tomato = tomato }
        fun setMushroom(mushroom: Boolean) = apply { this.mushroom = mushroom }
        fun setMozarella(mozarella: Boolean) = apply { this.mozarella = mozarella }
        fun setPepperoni(pepperoni: Boolean) = apply { this.pepperoni = pepperoni }

        fun build() =
            Pizza(tomato, mushroom, mozarella, pepperoni)

        fun reset() = apply {
            tomato = true
            mushroom = false
            mozarella = true
            pepperoni = false
        }
    }
}