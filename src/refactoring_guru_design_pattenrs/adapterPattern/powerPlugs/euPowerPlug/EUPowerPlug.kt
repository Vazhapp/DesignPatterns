package refactoring_guru_design_pattenrs.adapterPattern.powerPlugs.euPowerPlug

open class EUPowerPlug {
    open fun provide220V(): Int {
        println("Provide 220 Volt")
        return 220
    }
}