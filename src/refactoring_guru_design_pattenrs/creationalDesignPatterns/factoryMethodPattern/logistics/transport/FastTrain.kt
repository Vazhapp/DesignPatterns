package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.transport

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.Transport

class FastTrain : Transport {
    override fun delivery() {
        println("Doing fastest delivery with rails in a hours FastTrain")
    }

    override fun deliveryTime(): String {
        return "2 Days"
    }
}