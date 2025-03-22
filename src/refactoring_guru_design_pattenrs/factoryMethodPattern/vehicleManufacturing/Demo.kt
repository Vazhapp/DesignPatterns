package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing

import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicleFactory.CarFactory
import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicleFactory.MotorcycleFactory
import refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicleFactory.TruckFactory

fun main() {
    val carFactory = CarFactory()
    val motorcycleFactory = MotorcycleFactory()
    val truckFactory = TruckFactory()

    val car = carFactory.getVehicle()
    car.startEngine()
}