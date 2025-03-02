package refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator

import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.factories.ModernFurnitureFactory

fun main() {
    val client = Client(ModernFurnitureFactory())

    client.orderChair()
}