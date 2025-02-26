package refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.Transport

class Ship : Transport {
    override fun delivery() {
        println("Doing delivery with sea but slowly with slow Ship")
    }

    override fun deliveryTime(): String {
        return "45 Days"
    }
}