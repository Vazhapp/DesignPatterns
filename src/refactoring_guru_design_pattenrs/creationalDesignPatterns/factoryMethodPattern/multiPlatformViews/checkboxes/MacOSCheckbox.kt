package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews.checkboxes

class MacOSCheckbox : Checkbox {
    override fun getShape() {
        println("I get a MacOS Checkbox shape")

    }
}