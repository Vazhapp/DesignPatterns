package refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.logistCompanyTypes

import refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.Logistics
import refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.Transport
import refactoring_guru_design_pattenrs.factoryMethodPattern.logistics.transport.BigShip

class SeaLogistics : Logistics() {
    override fun getTransportObject(): Transport =
        BigShip()
}