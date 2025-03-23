package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories

import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.button.Button
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.button.WindowsButton
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.checkBox.CheckBox
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.checkBox.WindowsCheckBox
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.textField.TextField
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.textField.WindowsTextField

class WindowsGUIFactory : GUIFactory {
    override fun createButton(): Button {
        return WindowsButton()
    }

    override fun createCheckBox(): CheckBox {
        return WindowsCheckBox()
    }

    override fun createTextField(): TextField {
        return WindowsTextField()
    }
}