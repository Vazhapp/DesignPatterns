package refactoring_guru_design_pattenrs.builderPattern

import refactoring_guru_design_pattenrs.builderPattern.pcBuilder.PersonalComputer
import refactoring_guru_design_pattenrs.builderPattern.pizzaBuilder.Pizza

fun main() {
    val personalComputer = PersonalComputer.Builder()
        .setCpu("I9 14400K")
        .setGpu("RTX 3070 TI")
        .setRam(32)
        .setSsd(1000)
        .build()

    println("PC: ${personalComputer.cpu} / ${personalComputer.gpu} / ${personalComputer.ram} / ${personalComputer.hdd} / ${personalComputer.ssd} / ${personalComputer.motherBoard}")


    val pizzaBuilder = Pizza.Builder()
    val pizzaMargerita = pizzaBuilder
        .setTomato(true)
        .setMozarella(true)
        .setMushroom(false)
        .setPepperoni(false)
        .build()

    println("Pizza: Tomato: ${pizzaMargerita.tomato} / Mozarella: ${pizzaMargerita.mozarella} / Mushroom: ${pizzaMargerita.mushroom} / Pepperoni: ${pizzaMargerita.pepperoni}")
}