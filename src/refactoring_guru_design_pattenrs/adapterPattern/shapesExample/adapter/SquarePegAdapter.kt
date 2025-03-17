package refactoring_guru_design_pattenrs.adapterPattern.shapesExample.adapter

import refactoring_guru_design_pattenrs.adapterPattern.shapesExample.round.RoundPeg
import refactoring_guru_design_pattenrs.adapterPattern.shapesExample.square.SquarePeg
import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(
    private val squarePeg: SquarePeg
) : RoundPeg() {
    override fun getRadius(): Double = (sqrt((squarePeg.getWidth() / 2).pow(2.0) * 2))
}