package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.powerPlugs

import refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.powerPlugs.euPowerPlug.EUPowerPlug

class EuFridge(private val euPowerPlug: EUPowerPlug) {
    fun startWorking() {
        if (euPowerPlug.provide220V() < 220)
            println("Fridge not working: lack of power: ${euPowerPlug.provide220V()}")
        else
            println("Fridge Works!")
    }
}