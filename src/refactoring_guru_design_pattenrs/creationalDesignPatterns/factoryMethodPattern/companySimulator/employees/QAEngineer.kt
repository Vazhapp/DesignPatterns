package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.employees

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.Employee

class QAEngineer : Employee {
    override fun doWork() {
        println("Im testing the whole app")
    }
}