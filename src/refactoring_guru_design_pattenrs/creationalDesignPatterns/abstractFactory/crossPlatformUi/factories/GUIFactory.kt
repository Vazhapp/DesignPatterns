package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.factories

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.button.Button
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.checkBox.CheckBox
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.textField.TextField

interface GUIFactory {
    fun createButton(): Button
    fun createCheckBox(): CheckBox
    fun createTextField(): TextField
}