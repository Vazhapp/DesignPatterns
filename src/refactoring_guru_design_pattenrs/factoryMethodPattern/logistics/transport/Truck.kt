package refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.Transport

class Truck : Transport {
    override fun delivery() {
        println("Doing a longest road deliverys around the world with Truck")
    }

    override fun deliveryTime(): String {
        return "27 Days"
    }
}