package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.logistCompanyTypes

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.Logistics
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.Transport
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.logistics.transport.Airplane

class AirLogistics : Logistics() {
    override fun getTransportObject(): Transport =
        Airplane()
}