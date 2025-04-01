package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.Transport

class Bus : Transport {
    override fun delivery() {
        println("Doing a delivery with a comfortable long bus with humans")
    }

    override fun deliveryTime(): String {
        return "14 Days"
    }
}