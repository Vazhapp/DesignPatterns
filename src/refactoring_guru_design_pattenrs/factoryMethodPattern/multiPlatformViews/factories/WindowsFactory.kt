package refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.factories

import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.buttons.Button
import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.buttons.WindowsButton
import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.checkboxes.Checkbox
import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.checkboxes.WindowsCheckbox

class WindowsFactory : GUIFactory {
    override fun createButton(): Button = WindowsButton()

    override fun createCheckbox(): Checkbox = WindowsCheckbox()
}