package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.restaurantSimulator

abstract class Restourant {
    protected abstract fun getFoodRecpies(): List<FoodRecipe>

    protected fun prepareFood(foodRecipes: List<FoodRecipe>) {
        foodRecipes.forEach { recipe ->
            recipe.cookWithRecipe()
        }
    }
}