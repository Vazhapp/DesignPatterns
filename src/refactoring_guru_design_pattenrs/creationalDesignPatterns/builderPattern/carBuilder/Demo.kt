package refactoring_guru_design_pattenrs.creationalDesignPatterns.builderPattern.carBuilder

fun main() {
    val car = Car.Builder()
        .setModel("Mercedes")
        .setEngine(3)
        .addFeatures("Bounce")
        .build()

    println(car)
}