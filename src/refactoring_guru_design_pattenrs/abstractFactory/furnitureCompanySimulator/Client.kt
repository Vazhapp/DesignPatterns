package refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator

import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.Chair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.coffeetable.CoffeeTable
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.factories.FurnitureFactory

class Client(
    private val furnitureFactory: FurnitureFactory
) {
    private lateinit var orderedChair: Chair
    private lateinit var orderCoffeeTable: CoffeeTable

    fun orderChair() {
        orderedChair = furnitureFactory.createChair()
        getOrderedChair()
    }

    fun orderCoffeeTable() {
        orderCoffeeTable = furnitureFactory.createCoffeeTable()
        getOrderedCoffeeTable()
    }

    private fun getOrderedChair() {
        orderedChair.sitOn()
    }

    private fun getOrderedCoffeeTable() {
        orderCoffeeTable.putTheCup()
    }
}