package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicleFactory

import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Motorcycle
import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Vehicle

class MotorcycleFactory : VehicleFactory {
    override fun getVehicle(): Vehicle = Motorcycle()

    override fun startEngine() {
        getVehicle().startEngine()
    }
}