package refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.factories

import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.Chair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.ModernChair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.coffeetable.CoffeeTable
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.coffeetable.ModernCoffeeTable
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.sofa.ModernSofa
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.sofa.Sofa

class ModernFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair = ModernChair()

    override fun createCoffeeTable(): CoffeeTable = ModernCoffeeTable()

    override fun createSofa(): Sofa = ModernSofa()
}