package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle

class Truck : Vehicle {
    override fun createVehicle() {
        println("The Truck was created")
    }
}