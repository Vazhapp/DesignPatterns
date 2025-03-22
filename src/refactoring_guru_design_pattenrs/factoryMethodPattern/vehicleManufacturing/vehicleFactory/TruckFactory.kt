package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicleFactory

import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Truck
import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Vehicle

/**
 * The main purpose of a factory is not just to create an object reference,
 * it can also encapsulate important business logic and details related to the object
 */
class TruckFactory : VehicleFactory {
    override fun getVehicle(): Vehicle = Truck()

    override fun startEngine() {
        getVehicle().startEngine()
    }
}