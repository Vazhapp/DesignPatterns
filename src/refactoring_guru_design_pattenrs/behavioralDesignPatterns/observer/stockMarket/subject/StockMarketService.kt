package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket.subject

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket.observer.MarketObserver

class StockMarketService {
    private val observers = mutableListOf<MarketObserver>()
    private val stockPrices = mutableMapOf<String, Double>()

    fun addObserver(observer: MarketObserver) {
        observers.add(observer)
    }

    fun removeObserver(observer: MarketObserver) {
        observers.remove(observer)
    }

    fun updateStockPrices(stockSymbol: String, price: Double) {
        stockPrices[stockSymbol] = price
        notifyObservers(stockSymbol, price)
    }

    private fun notifyObservers(stockSymbol: String, price: Double) {
        observers.forEach { observer -> observer.newPrices(stockSymbol, price) }
    }
}