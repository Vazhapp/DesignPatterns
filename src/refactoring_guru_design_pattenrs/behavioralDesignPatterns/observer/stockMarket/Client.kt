package refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket.observer.MobileApp
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket.observer.TradingBot
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.observer.stockMarket.subject.StockMarketService

fun main() {
    val stockMarketService = StockMarketService()

    val market1 = MobileApp("Google")
    val market2 = MobileApp("Apple")
    val tradingBot = TradingBot("Bot Vazha")
    val tradingBot2 = TradingBot("Bot Pepsi")

    stockMarketService.addObserver(tradingBot)
    stockMarketService.addObserver(market1)

    stockMarketService.updateStockPrices("B", 12312.33)

    stockMarketService.removeObserver(tradingBot)

    stockMarketService.updateStockPrices("B", 867.33)
}