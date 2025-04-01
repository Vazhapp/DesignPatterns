package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.logistCompanyTypes

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.Logistics
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.Transport
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.transport.BigShip

class SeaLogistics : Logistics() {
    override fun getTransportObject(): Transport =
        BigShip()
}