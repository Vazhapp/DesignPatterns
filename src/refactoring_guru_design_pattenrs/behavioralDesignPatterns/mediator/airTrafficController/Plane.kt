package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.airTrafficController

class Plane(val id: Int, private val mediator: AirTrafficController) {
    var isLanding = false
        private set

    init {
        mediator.registerPlane(this)
    }

    fun requestToLand() {
        mediator.requestLanding(this)
    }

    fun land() {
        isLanding = true
        println("$id is landing.")
    }
}