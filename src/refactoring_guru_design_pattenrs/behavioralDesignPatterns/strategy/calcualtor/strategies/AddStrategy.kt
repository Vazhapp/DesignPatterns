package refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.strategies

class AddStrategy : MathStrategy {
    override fun action(a: Int, b: Int): Int = a + b
}