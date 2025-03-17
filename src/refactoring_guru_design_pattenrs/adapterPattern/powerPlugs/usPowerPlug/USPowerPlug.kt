package refactoring_guru_design_pattenrs.adapterPattern.powerPlugs.usPowerPlug

class USPowerPlug {
    fun provide110V(): Int {
        println("Provide 110 Volt")
        return 110
    }
}