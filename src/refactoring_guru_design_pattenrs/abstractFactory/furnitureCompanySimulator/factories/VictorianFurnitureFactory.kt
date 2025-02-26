package refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.factories

import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.Chair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.VictorianChair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.coffeetable.CoffeeTable
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.coffeetable.VictorianCoffeeTable
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.sofa.Sofa
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.sofa.VictorianSofa

class VictorianFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair = VictorianChair()

    override fun createCoffeeTable(): CoffeeTable = VictorianCoffeeTable()

    override fun createSofa(): Sofa = VictorianSofa()
}