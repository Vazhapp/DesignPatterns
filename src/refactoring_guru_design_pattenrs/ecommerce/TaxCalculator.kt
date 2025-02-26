package refactoring_guru_design_pattenrs.ecommerce

class TaxCalculator {
    fun calcualteOrderTaxByCountry(country: Order.Country): Float {
        return when (country) {
            Order.Country.UNITED_STATES -> 1.6f
            Order.Country.EUROPE -> 2f
            Order.Country.GEORGIA -> 1.2f
        }
    }
}