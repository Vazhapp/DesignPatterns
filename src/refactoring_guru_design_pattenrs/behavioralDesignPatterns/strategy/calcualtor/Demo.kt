package refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.context.Calculator
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.strategies.AddStrategy
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.strategies.DivideStrategy
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.strategy.calcualtor.strategies.MultiplyStrategy

fun main() {
    val calculator = Calculator()

    calculator.setStrategy(MultiplyStrategy())
    val result = calculator.performOperation(5,4)

    println(result)
}