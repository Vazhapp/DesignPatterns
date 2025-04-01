package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.furnitureCompanySimulator

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.furnitureCompanySimulator.factories.ModernFurnitureFactory

fun main() {
    val client = Client(ModernFurnitureFactory())

    client.orderChair()

    client.orderCoffeeTable()
}