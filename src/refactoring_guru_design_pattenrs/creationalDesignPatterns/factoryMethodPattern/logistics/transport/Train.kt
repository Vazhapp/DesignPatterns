package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.Transport

class Train : Transport {
    override fun delivery() {
        println("Doing delivery with rails but a slowly Train")
    }

    override fun deliveryTime(): String {
        return "3 Days"
    }
}