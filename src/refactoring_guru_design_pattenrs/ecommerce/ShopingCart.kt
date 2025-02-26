package refactoring_guru_design_pattenrs.ecommerce

class ShopingCart {
    private val cartItems = listOf(
        Order("Soap", 2f, Order.Country.GEORGIA),
        Order("Soap", 4.99f, Order.Country.UNITED_STATES),
        Order("Soap", 6.6f, Order.Country.EUROPE),
        Order("Soap", 7.3f, Order.Country.GEORGIA),
        Order("Soap", 5f, Order.Country.UNITED_STATES),
        Order("Soap", 1.6f, Order.Country.EUROPE),
    )

    private val taxCalculator = TaxCalculator()

    fun getOrderTotal(): Float {
        var total = 0f

        cartItems.forEach { item ->
            total += item.price * taxCalculator.calcualteOrderTaxByCountry(item.country)

        }
        return total
    }
}