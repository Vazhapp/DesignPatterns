package refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.employees

import refactoring_guru_design_pattenrs.factoryMethodPattern.companySimulator.Employee

class SolutionArchitect : Employee {
    override fun doWork() {
        println("Im preparing the APIs")
    }
}