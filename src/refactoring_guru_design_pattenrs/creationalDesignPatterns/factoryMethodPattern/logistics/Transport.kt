package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics

interface Transport {
    fun delivery()
    fun deliveryTime(): String
}