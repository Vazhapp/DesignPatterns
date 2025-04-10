package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.airTrafficController

class AirTrafficController {
    private val registeredPlanes = mutableListOf<Plane>()

    fun registerPlane(plane: Plane) {
        registeredPlanes.add(plane)
    }

    fun requestLanding(plane: Plane) {
        if (isRunwayClear()) {
            println("${plane.id} is cleared to land.")
            plane.land()
        } else {
            println("${plane.id} is waiting to be land. Runway is Busy!")
        }
    }

    private fun isRunwayClear(): Boolean = registeredPlanes.all { !it.isLanding }
}