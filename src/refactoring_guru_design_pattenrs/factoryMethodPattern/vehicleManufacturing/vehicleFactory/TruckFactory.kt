package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicleFactory

import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Truck
import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Vehicle

class TruckFactory : VehicleFactory {
    override fun getVehicle(): Vehicle = Truck()
}