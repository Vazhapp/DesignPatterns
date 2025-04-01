package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.Transport

class BigShip : Transport {
    override fun delivery() {
        println("Doing a lot products delivry via sea")
    }

    override fun deliveryTime(): String {
        return "24 Days"
    }
}