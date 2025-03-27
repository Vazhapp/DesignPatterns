package refactoring_guru_design_pattenrs.decoratorPattern.coffeeShop

class Sugar(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost(): Int = coffee.cost() + 1

    override fun description(): String = "${coffee.description()} With Sugar"
}