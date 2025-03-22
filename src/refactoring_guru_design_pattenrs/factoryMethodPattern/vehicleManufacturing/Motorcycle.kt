package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing

class Motorcycle : Vehicle {
    override fun createVehicle() {
        println("The Motorcycle was created")
    }
}