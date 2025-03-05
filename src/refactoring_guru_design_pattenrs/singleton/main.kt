package refactoring_guru_design_pattenrs.singleton

import refactoring_guru_design_pattenrs.singleton.nonThreadSafe.SingletonNonThreadSafe

fun main() {
    val firstSingleton = SingletonNonThreadSafe.getInstance("First Singleton")
    val secondSingleton = SingletonNonThreadSafe.getInstance("Second Singleton")

    println(firstSingleton.value)
    println(secondSingleton.value)
}