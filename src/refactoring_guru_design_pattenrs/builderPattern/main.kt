package refactoring_guru_design_pattenrs.builderPattern

import refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.Pizzeria

fun main() {
//    val builderClient = Client()
//
//    builderClient.buildCarWithDirector()
//    builderClient.buildCarWithBuilder()
//
//    builderClient.buildCarManual()
//
    val pizzeria = Pizzeria()
    val pepperoniPizza = pizzeria.bakePizzaWithDirector(bakePepperoni = true)
    val supremePizza = pizzeria.bakePizzaWithBuilder(bakePepperoni = false)

    println("Baked Director Pizzas: $pepperoniPizza \nBaked Buidler Pizzas: $supremePizza")
}