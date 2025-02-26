package refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.Transport

class Helicopter : Transport {
    override fun delivery() {
        println("Doing delivery via sky but with slow Helicopter")
    }

    override fun deliveryTime(): String {
        return "1 Day"
    }
}