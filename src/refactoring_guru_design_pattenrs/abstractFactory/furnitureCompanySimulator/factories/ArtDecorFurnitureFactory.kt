package refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.factories

import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.ArtDecorChair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.chair.Chair
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.coffeetable.ArtDecorCoffeeTable
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.coffeetable.CoffeeTable
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.sofa.ArtDecorSofa
import refactoring_guru_design_pattenrs.abstractFactory.furnitureCompanySimulator.sofa.Sofa

class ArtDecorFurnitureFactory : FurnitureFactory {
    override fun createChair(): Chair = ArtDecorChair()

    override fun createCoffeeTable(): CoffeeTable = ArtDecorCoffeeTable()

    override fun createSofa(): Sofa = ArtDecorSofa()
}