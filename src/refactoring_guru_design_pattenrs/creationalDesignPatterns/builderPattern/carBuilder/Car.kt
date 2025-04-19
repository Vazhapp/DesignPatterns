package refactoring_guru_design_pattenrs.creationalDesignPatterns.builderPattern.carBuilder

class Car private constructor(
    val engine: Int,
    val model: String,
    val features: List<String>,
) {

    class Builder {
        private var engine: Int = 0
        private var model: String = "Not Defined"
        private var features = mutableListOf<String>()

        fun setEngine(engine: Int) = apply { this.engine = engine }
        fun setModel(model: String) = apply { this.model = model }
        fun addFeatures(feature: String) = apply { this.features.add(feature) }

        fun build() = Car(engine = engine, model = model, features = features)
    }

    override fun toString(): String {
        return "Car(model='$model', engine='$engine', features=$features)"
    }

}