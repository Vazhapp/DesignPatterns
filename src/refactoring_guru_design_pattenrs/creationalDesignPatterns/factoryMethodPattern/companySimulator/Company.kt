package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.companySimulator

abstract class Company {

    protected abstract fun getEmployees() : List<Employee>

    protected fun createSoftware(team: List<Employee>) {
        team.forEach { teamMember ->
            teamMember.doWork()
        }
    }
}