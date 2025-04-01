package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.wheels

class AllTerrainWheels : Wheel {
    override fun installWheels() {
        println("Installed All Terrain Wheels")
    }
}