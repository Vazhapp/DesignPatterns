package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing.vehicleFactory.CarFactory
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing.vehicleFactory.MotorcycleFactory
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.vehicleManufacturing.vehicleFactory.TruckFactory

fun main() {
    val carFactory = CarFactory()
    val motorcycleFactory = MotorcycleFactory()
    val truckFactory = TruckFactory()

    val car = carFactory.getVehicle()
    car.startEngine()
}