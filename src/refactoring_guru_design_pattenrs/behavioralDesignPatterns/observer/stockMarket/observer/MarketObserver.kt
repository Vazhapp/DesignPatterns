package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket.observer

interface MarketObserver {
    fun newPrices(stockSymbol: String, price: Double)
}