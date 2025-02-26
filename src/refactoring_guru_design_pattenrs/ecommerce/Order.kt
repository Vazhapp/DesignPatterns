package refactoring_guru_design_pattenrs.ecommerce

data class Order(
    val name: String,
    val price: Float,
    val country: Country
) {
    enum class Country {
        UNITED_STATES,
        EUROPE,
        GEORGIA;
    }
}
