package refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.cars

import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.drivingSystem.DrivingSystem
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine.Engine

data class Car(
    val seatNumber: Int,
    val engine: Engine?,
    val drivingSystem: DrivingSystem?,
    val gps: Boolean,
    val autoPilot: Boolean,
)