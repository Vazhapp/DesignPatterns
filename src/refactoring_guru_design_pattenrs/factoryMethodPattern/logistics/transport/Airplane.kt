package refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.Transport

class Airplane : Transport {
    override fun delivery() {
        println("Doing fastest Delivery via sky")
    }

    override fun deliveryTime(): String {
        return "1 Day"
    }
}