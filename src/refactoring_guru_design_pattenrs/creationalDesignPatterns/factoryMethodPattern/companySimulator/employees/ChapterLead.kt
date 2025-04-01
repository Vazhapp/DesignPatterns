package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.employees

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.Employee

class ChapterLead : Employee {
    override fun doWork() {
        println("Im controlling quality fo the code")
    }
}