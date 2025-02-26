package refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.companies

import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.Company
import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.Employee
import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.employees.*

class OutsourcingCompany : Company() {
    override fun getEmployees(): List<Employee> = listOf(
        SolutionArchitect(),
        ProjectOwner(),
        ChapterLead(),
        QAEngineer(),
        Tester(),
        SoftwareEngineer(),
    )

    fun buildProject() {
        createSoftware(getEmployees())
    }
}