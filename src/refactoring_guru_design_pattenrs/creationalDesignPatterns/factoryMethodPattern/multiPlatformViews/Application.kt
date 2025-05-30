package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews.factories.GUIFactory

class Application(guiFactory: GUIFactory) {
    private val button = guiFactory.createButton()
    private val checkbox = guiFactory.createCheckbox()

    fun generateViwsByOS() {
        button.getShape()
        checkbox.getShape()
    }
}