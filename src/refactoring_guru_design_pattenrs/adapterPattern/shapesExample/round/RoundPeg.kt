package refactoring_guru_design_pattenrs.adapterPattern.shapesExample.round

open class RoundPeg(private val radius: Double = 0.0) {
    fun getRadius(): Double = radius
}