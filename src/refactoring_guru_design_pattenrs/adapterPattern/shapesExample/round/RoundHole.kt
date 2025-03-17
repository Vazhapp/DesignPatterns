package refactoring_guru_design_pattenrs.adapterPattern.shapesExample.round

class RoundHole(private val radius: Double) {

    fun getRadius(): Double = radius

    fun fits(roundPeg: RoundPeg): Boolean {
        return radius >= roundPeg.getRadius()
    }
}