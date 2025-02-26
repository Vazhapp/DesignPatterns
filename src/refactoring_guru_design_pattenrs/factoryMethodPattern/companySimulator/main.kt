package refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator

import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.companies.GameDevCompany
import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.companies.OutsourcingCompany

// Factory Method pattern
fun main() {
    val gameDevCompany = GameDevCompany()
    val outsourcingCompany = OutsourcingCompany()

    outsourcingCompany.buildProject()

}