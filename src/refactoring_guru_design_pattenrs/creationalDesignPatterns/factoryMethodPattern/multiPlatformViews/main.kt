package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews.factories.WindowsFactory

fun main() {
    val application = Application(WindowsFactory())

    application.generateViwsByOS()
}