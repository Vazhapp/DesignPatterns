package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.receiver

class Bar {
    fun prepareCocktail(cocktail: Cocktail) {
        println("Preparing a cocktail: ${cocktail.name}")
    }

    fun prepareHotDrinks(hotDrink: HotDrink) {
        println("Preparing a hot drink: ${hotDrink.name}")
    }
}