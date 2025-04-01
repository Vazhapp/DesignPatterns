package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews.factories

import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews.buttons.Button
import refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews.checkboxes.Checkbox

interface GUIFactory {
    fun createButton(): Button
    fun createCheckbox(): Checkbox
}