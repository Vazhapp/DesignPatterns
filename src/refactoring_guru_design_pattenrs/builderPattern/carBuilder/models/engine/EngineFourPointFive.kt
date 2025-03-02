package refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine

data class EngineFourPointFive(
    override val volumeOfEngine: Float,
    override val cylinders: Int
) : Engine