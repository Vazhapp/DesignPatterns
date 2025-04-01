package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.powerPlugs

import refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.powerPlugs.euPowerPlug.EUPowerPlug
import refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.powerPlugs.usPowerPlug.USPowerPlug

class UsToEuPowerAdapter(private val usPowerPlug: USPowerPlug) : EUPowerPlug() {
    override fun provide220V(): Int {
        println("Adapting 110V to 220V")
        return usPowerPlug.provide110V().times(2)
    }
}