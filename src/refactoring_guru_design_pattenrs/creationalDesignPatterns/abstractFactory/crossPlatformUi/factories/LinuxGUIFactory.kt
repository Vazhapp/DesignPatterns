package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.factories

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.button.Button
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.button.LinuxButton
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.checkBox.CheckBox
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.checkBox.LinuxCheckBox
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.textField.LinuxTextField
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.textField.TextField

class LinuxGUIFactory : GUIFactory {
    override fun createButton(): Button {
        return LinuxButton()
    }

    override fun createCheckBox(): CheckBox {
        return LinuxCheckBox()
    }

    override fun createTextField(): TextField {
        return LinuxTextField()
    }
}