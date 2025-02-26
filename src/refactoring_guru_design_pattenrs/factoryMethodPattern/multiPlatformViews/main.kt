package refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews

import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.factories.WindowsFactory

fun main() {
    val application = Application(WindowsFactory())

    application.generateViwsByOS()
}