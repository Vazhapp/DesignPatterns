package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.checkBox

class MacOsCheckBox : CheckBox {
    override fun renderCheckBox() {
        println("Rendering MacOS Check Box")
    }
}