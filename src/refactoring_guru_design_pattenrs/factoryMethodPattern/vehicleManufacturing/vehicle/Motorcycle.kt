package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle

class Motorcycle : Vehicle {
    override fun createVehicle() {
        println("The Motorcycle was created")
    }
}