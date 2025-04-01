package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.companies

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.Company
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.Employee
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.employees.*

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