package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories

import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.button.Button
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.button.MacOsButton
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.checkBox.CheckBox
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.checkBox.MacOsCheckBox
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.textField.MacOsTextField
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.textField.TextField

class MacOsGUIFactory : GUIFactory {
    override fun createButton(): Button {
        return MacOsButton()
    }

    override fun createCheckBox(): CheckBox {
        return MacOsCheckBox()
    }

    override fun createTextField(): TextField {
        return MacOsTextField()
    }
}