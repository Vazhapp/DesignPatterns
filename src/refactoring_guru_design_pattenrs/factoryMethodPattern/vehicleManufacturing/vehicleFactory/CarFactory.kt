package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicleFactory

import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Car
import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Vehicle

class CarFactory : VehicleFactory {
    override fun getVehicle(): Vehicle = Car()
}