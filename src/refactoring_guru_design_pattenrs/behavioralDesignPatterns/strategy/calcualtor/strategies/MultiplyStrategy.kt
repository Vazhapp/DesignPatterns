package refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.strategies

class MultiplyStrategy : MathStrategy {
    override fun action(a: Int, b: Int): Int = a * b
}