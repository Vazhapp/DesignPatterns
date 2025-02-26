package refactoring_guru_design_pattenrs.cats

fun main() {
    val cat = Cat()

    cat.eat(Broccoli(20))
    cat.eat(Broccoli(20))
    cat.eat(Meat(60))

    println(cat.getNutrition())
}