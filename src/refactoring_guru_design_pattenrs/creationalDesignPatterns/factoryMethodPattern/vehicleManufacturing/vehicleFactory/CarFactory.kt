package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing.vehicleFactory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing.vehicle.Car
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing.vehicle.Vehicle

/**
 * The main purpose of a factory is not just to create an object reference,
 * it can also encapsulate important business logic and details related to the object
 */
class CarFactory : VehicleFactory {
    override fun getVehicle(): Vehicle = Car()
}