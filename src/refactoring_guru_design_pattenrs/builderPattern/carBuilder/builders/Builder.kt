package refactoring_guru_design_pattenrs.builderPattern.carBuilder.builders

import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.drivingSystem.DrivingSystem
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine.Engine

interface Builder {
    fun reset()
    fun setSeats(seatsNumber: Int)
    fun setEngine(engine: Engine)
    fun setDrivingSystem(drivingSystem: DrivingSystem)
    fun setGps(setGps: Boolean)
    fun setAutoPilot(setAutoPilot: Boolean)
}