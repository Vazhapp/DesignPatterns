package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing.vehicleFactory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing.vehicle.Vehicle

interface VehicleFactory {
    fun getVehicle(): Vehicle
}