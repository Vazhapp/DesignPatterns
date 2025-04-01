package refactoring_guru_design_pattenrs.structuralDesignPatterns.decoratorPattern.coffeeShop

class StandardCoffee : Coffee {
    override fun cost(): Int = 2

    override fun description(): String = "Standard Coffee"
}