package refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.factories

import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.buttons.Button
import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.buttons.MacOSButton
import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.checkboxes.Checkbox
import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.checkboxes.MacOSCheckbox

class MacOSFactory : GUIFactory {
    override fun createButton(): Button = MacOSButton()

    override fun createCheckbox(): Checkbox = MacOSCheckbox()
}