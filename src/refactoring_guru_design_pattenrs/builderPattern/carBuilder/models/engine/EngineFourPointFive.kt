package refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine

data class EngineFourPointFive(
    override val volumeOfEngine: Float = 4.5f,
    override val cylinders: Int = 8
) : Engine