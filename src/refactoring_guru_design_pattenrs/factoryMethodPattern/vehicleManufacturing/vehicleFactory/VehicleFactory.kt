package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicleFactory

import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle.Vehicle

interface VehicleFactory {
    fun getVehicle() : Vehicle
}