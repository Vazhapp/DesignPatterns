package refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.factories

import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.buttons.Button
import refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.checkboxes.Checkbox

interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}