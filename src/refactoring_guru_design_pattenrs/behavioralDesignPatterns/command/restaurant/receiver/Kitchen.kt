package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.restaurant.receiver

class Kitchen {
    fun prepareDish(dish: Dish) {
        println("Preparing a dish: ${dish.name}")
    }

    fun bakeDish(dish: Dish) {
        println("Baking a dish: ${dish.name}")
    }
}