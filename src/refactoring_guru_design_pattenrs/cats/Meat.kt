package refactoring_guru_design_pattenrs.cats

data class Meat(
    private val nutrition: Int
) : Food {
    override fun getNutrition(): Int {
        return nutrition
    }
}