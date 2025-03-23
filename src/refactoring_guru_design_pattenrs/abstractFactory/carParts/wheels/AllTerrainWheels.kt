package refactoring_guru_design_pattenrs.abstractFactory.carParts.wheels

class AllTerrainWheels : Wheel {
    override fun installWheels() {
        println("Installed All Terrain Wheels")
    }
}