package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.factories.SportCarFactory
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.factories.SuvCarFactory

fun main() {
    val sportCarFactory = SportCarFactory()
    val suvCarFactory = SuvCarFactory()

    val conveyor = Conveyor(suvCarFactory)

    conveyor.buildCar()
}