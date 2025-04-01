package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.shapesExample.round

open class RoundPeg(private val radius: Double = 0.0) {
    open fun getRadius(): Double = radius
}