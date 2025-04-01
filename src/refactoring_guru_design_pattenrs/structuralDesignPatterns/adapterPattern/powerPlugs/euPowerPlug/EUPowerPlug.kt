package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.powerPlugs.euPowerPlug

open class EUPowerPlug {
    open fun provide220V(): Int {
        return 220
    }
}