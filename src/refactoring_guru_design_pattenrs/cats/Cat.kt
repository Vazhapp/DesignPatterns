package refactoring_guru_design_pattenrs.cats

class Cat : Food {
    private var energy = 0

    fun eat(food: Food) {
        energy += food.getNutrition()
    }

    override fun getNutrition(): Int {
        return energy
    }
}