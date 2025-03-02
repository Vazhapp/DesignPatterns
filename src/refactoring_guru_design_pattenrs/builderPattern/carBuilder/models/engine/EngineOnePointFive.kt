package refactoring_guru_design_pattenrs.builderPattern.carBuilder.models.engine

data class EngineOnePointFive(
    override val volumeOfEngine: Float = 1.5f,
    override val cylinders: Int = 4
) : Engine