package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.employees

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.Employee

class SoftwareEngineer : Employee {
    override fun doWork() {
        println("Im Writing the code and preparing architecture")
    }
}