package refactoring_guru_design_pattenrs.builderPattern.carBuilder

import refactoring_guru_design_pattenrs.builderPattern.carBuilder.builders.CarBuilder
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.builders.CarManualBuilder
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.director.Director
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.drivingSystem.DrivingSystem
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine.EngineFourPointFive
import refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine.EngineTwoPointZero

class Client {
    private val director: Director = Director()
    private val builder: CarBuilder = CarBuilder()
    private val carManualBuilder: CarManualBuilder = CarManualBuilder()

    fun buildCarWithDirector() {
        director.buildTrucks(builder = builder)
        println("Built car Engine Volume: ${builder.car.engine?.volumeOfEngine}")
    }

    fun buildCarWithBuilder() {
        builder.apply {
            setEngine(EngineTwoPointZero())
            setSeats(8)
            setDrivingSystem(DrivingSystem.REAR_DRIVING)
            setGps(true)
            setAutoPilot(true)
        }.car
    }

    fun buildCarManual() {
        carManualBuilder.apply {
            setEngine(builder.car.engine ?: EngineFourPointFive())
            setDrivingSystem(builder.car.drivingSystem ?: DrivingSystem.X_DRIVE)
            setSeats(builder.car.seatNumber)
            setGps(builder.car.gps)
            setAutoPilot(builder.car.autoPilot)
        }
        println(carManualBuilder.carManual)
    }
}