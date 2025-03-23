package refactoring_guru_design_pattenrs.abstractFactory.carParts

import refactoring_guru_design_pattenrs.abstractFactory.carParts.factories.VehicleFactory

class Conveyor(vehicleFactory: VehicleFactory) {
    private val engine = vehicleFactory.installEngine()
    private val interior = vehicleFactory.installInterior()
    private val wheel = vehicleFactory.installWheel()

    fun buildCar() {
        engine.installEngine()
        interior.installInterior()
        wheel.installWheels()
    }
}