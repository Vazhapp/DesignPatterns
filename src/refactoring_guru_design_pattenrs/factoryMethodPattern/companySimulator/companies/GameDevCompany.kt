package refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.companies

import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.Company
import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.Employee
import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.employees.ChapterLead
import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.employees.ProjectOwner
import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.employees.SoftwareEngineer
import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.employees.Tester

class GameDevCompany : Company() {
    override fun getEmployees(): List<Employee> = listOf(
        ChapterLead(),
        ProjectOwner(),
        SoftwareEngineer(),
        Tester(),
    )

    fun buildProject() {
        createSoftware(getEmployees())
    }
}