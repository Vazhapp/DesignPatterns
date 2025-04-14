package refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.context

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.strategies.MathStrategy

class Calculator {
    private var strategy: MathStrategy? = null

    fun setStrategy(strategy: MathStrategy) {
        this.strategy = strategy
    }

    fun performOperation(a: Int, b: Int): Int =
        strategy?.action(a, b) ?: throw IllegalStateException("Strategy not set")
}