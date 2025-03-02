package refactoring_guru_design_pattenrs.builderPattern.carBuilder.builders

import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.cars.CarManual
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.drivingSystem.DrivingSystem
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine.Engine

class CarManualBuilder : Builder {
    private var seatsNumber: Int = 0
    private var engine: Engine? = null
    private var drivingSystem: DrivingSystem? = null
    private var setGps: Boolean = false
    private var setAutoPilot: Boolean = false

    override fun reset() {
        println("Car Manual Builder reset called")
    }

    override fun setSeats(seatsNumber: Int) {
        this.seatsNumber = seatsNumber
    }

    override fun setEngine(engine: Engine) {
        this.engine = engine
    }

    override fun setDrivingSystem(drivingSystem: DrivingSystem) {
        this.drivingSystem = drivingSystem
    }

    override fun setGps(setGps: Boolean) {
        this.setGps = setGps
    }

    override fun setAutoPilot(setAutoPilot: Boolean) {
        this.setAutoPilot = setAutoPilot
    }

    val carManual
        get() = CarManual(seatsNumber, engine, drivingSystem, setGps, setAutoPilot)
}