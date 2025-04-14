package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket.observer

class MobileApp(private val applicationName: String) : MarketObserver {
    override fun newPrices(stockSymbol: String, price: Double) {
        println("$applicationName is trading $stockSymbol at $price")
    }
}