package refactoring_guru_design_pattenrs.factoryMethodPattern.vehicleManufacturing.vehicle

class Car : Vehicle {
    override fun createVehicle() {
        println("The Car was created")
    }
}