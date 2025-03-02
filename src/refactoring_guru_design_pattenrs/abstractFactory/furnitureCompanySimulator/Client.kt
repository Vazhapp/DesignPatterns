package refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator

import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.Chair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.factories.FurnitureFactory

class Client(
    private val furnitureFactory: FurnitureFactory
) {
    private lateinit var orderedChair: Chair

    fun orderChair() {
        orderedChair = furnitureFactory.createChair()
        getOrderedChair()
    }

    private fun getOrderedChair() {
        orderedChair.sitOn()
    }
}