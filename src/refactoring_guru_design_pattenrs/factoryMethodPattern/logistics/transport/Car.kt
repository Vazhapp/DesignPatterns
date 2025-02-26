package refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.Transport

class Car : Transport {
    override fun delivery() {
        println("Doing delivery a personal cargos with car")
    }

    override fun deliveryTime(): String {
        return "7 Days"
    }
}