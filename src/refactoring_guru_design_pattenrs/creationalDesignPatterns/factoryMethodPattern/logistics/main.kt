package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.logistCompanyTypes.AirLogistics
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.logistCompanyTypes.RoadLogistics
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.logistCompanyTypes.SeaLogistics

fun main() {
    val roadLogistics = RoadLogistics()
    val airLogistics = AirLogistics()
    val seaLogistics = SeaLogistics()

    roadLogistics.startDeliveryAfeterPlanned()
}