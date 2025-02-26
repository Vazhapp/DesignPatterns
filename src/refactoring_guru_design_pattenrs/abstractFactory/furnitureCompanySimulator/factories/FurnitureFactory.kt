package refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.factories

import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.Chair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.coffeetable.CoffeeTable
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.sofa.Sofa

interface FurnitureFactory {
    fun createChair(): Chair
    fun createCoffeeTable(): CoffeeTable
    fun createSofa(): Sofa
}