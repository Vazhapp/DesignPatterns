package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.airTrafficController

fun main() {
    val mediator = AirTrafficController()
    val plane1 = Plane(1, mediator)
    val plane2 = Plane(2, mediator)
    val plane3 = Plane(3, mediator)

    plane1.requestToLand()

    plane2.requestToLand()
    plane3.requestToLand()
}