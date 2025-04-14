package refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.strategies

class DivideStrategy : MathStrategy {
    override fun action(a: Int, b: Int): Int {
        if (a == 0 || b == 0)
            return 0

        return a / b
    }
}