package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket.observer

class TradingBot(private val botName: String) : MarketObserver {
    override fun newPrices(stockSymbol: String, price: Double) {
        println("$botName is trading $stockSymbol at $price")
    }
}