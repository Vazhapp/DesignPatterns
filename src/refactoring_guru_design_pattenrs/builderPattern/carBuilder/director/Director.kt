package refactoring_guru_design_pattenrs.builderPattern.carBuilder.director

import refactoring_guru_design_pattenrs.builderPattern.carBuilder.builders.Builder
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.drivingSystem.DrivingSystem
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine.EngineFourPointFive
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine.EngineTwoPointZero

class Director() {
    fun buildSportCar(builder: Builder) {
        builder.apply {
            setEngine(EngineTwoPointZero())
            setDrivingSystem(DrivingSystem.REAR_DRIVING)
            setSeats(2)
            setAutoPilot(false)
            setGps(false)
        }
    }

    fun buildSUVCar(builder: Builder) {
        builder.apply {
            setEngine(EngineTwoPointZero())
            setDrivingSystem(DrivingSystem.FRONT_WHEEL)
            setSeats(6)
            setAutoPilot(true)
            setGps(true)
        }
    }

    fun buildTrucks(builder: Builder) {
        builder.apply {
            setEngine(EngineFourPointFive())
            setDrivingSystem(DrivingSystem.X_DRIVE)
            setSeats(6)
            setAutoPilot(true)
            setGps(true)
        }
    }
}