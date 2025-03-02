package refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine

data class EngineTwoPointZero(
    override val volumeOfEngine: Float = 2.0f,
    override val cylinders: Int = 6
) : Engine