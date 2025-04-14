package refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.strategies

interface MathStrategy {
    fun action(a: Int, b: Int): Int
}