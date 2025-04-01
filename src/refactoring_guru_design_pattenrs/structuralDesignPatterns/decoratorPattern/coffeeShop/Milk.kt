package refactoring_guru_design_pattenrs.structuralDesignPatterns.decoratorPattern.coffeeShop

class Milk(
    coffee: Coffee
) : CoffeeDecorator(coffee) {
    override fun cost(): Int = coffee.cost() + 4

    override fun description(): String = "${coffee.description()} With Milk"
}