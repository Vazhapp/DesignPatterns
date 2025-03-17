package refactoring_guru_design_pattenrs.adapterPattern.powerPlugs

import refactoring_guru_design_pattenrs.adapterPattern.powerPlugs.euPowerPlug.EUPowerPlug
import refactoring_guru_design_pattenrs.adapterPattern.powerPlugs.usPowerPlug.USPowerPlug

class UsToEuPowerAdapter(private val usPowerPlug: USPowerPlug) : EUPowerPlug() {
    override fun provide220V(): Int {
        return usPowerPlug.provide110V().times(2)
    }
}