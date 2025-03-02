package refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.cars

import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.drivingSystem.DrivingSystem
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine.Engine

data class CarManual(
    val seatNumber: Int,
    val engine: Engine?,
    val drivingSystem: DrivingSystem?,
    val gps: Boolean,
    val autoPilot: Boolean,
) {
    fun generateManual(): String {
        return """
        Car's driving system is: ${drivingSystem?.name}, 
        it's required to change engine oil every 10,000 miles.
        
        Changing the engine timing belt is not required until you reach more than 150,000 miles.

        Car info:
        Seats: $seatNumber
        Engine Volume: ${engine?.volumeOfEngine}
        Engine Cylinders: ${engine?.cylinders}
        Has GPS: $gps
        Has AutoPilot: $autoPilot
        
        Thanks a lot, dear Car Manufacturer.
    """.trimIndent()
    }
}