package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi

import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories.GUIFactory

class Application(guiFactory: GUIFactory) {
    private val button = guiFactory.createButton()
    private val textField = guiFactory.createTextField()
    private val checkBox = guiFactory.createCheckBox()

    fun renderViews() {
        button.renderButton()
        textField.renderTextField()
        checkBox.renderCheckBox()
    }
}