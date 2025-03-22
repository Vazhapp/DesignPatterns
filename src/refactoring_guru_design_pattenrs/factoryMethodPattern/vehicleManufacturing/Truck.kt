package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing

class Truck : Vehicle {
    override fun createVehicle() {
        println("The Truck was created")
    }
}