package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.employees

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator.Employee

class ProjectOwner : Employee {
    override fun doWork() {
        println("Im looking at Jira and preparing future tasks")
    }
}