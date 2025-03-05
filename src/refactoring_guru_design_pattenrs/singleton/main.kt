package refactoring_guru_design_pattenrs.singleton

import refactoring_guru_design_pattenrs.singleton.nonThreadSafe.SingletonNonThreadSafe
import refactoring_guru_design_pattenrs.singleton.threadSafe.SingletonThreadSafe

fun main() {
//    val firstSingleton = SingletonNonThreadSafe.getInstance("First Singleton")
//    val secondSingleton = SingletonNonThreadSafe.getInstance("Second Singleton")
//
//    println(firstSingleton.value)
//    println(secondSingleton.value)

    // If its thread safe sohuld return the same value: 2x First Singleton
    val threadFirst = Thread(ThreadFirst())
    val threadSecond = Thread(ThreadSecond())

    threadFirst.start()
    threadSecond.start()
}

class ThreadFirst : Runnable {
    override fun run() {
        val firstSingleton = SingletonThreadSafe.getInstance("First Singleton")
        println(firstSingleton.value)
    }
}

class ThreadSecond : Runnable {
    override fun run() {
        val secondSingleton = SingletonThreadSafe.getInstance("Second Singleton")
        println(secondSingleton.value)
    }
}