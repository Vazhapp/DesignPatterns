package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.shapesExample.square

import kotlin.math.pow

class SquarePeg(private val width: Double) {
    fun getWidth(): Double = width

    fun getSquare(): Double = width.pow(2.0)
}