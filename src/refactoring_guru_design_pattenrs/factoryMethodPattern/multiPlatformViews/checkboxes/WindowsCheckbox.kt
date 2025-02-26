package refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.checkboxes

class WindowsCheckbox : Checkbox {
    override fun getShape() {
        println("I get a MacOS Checkbox shape")
    }
}