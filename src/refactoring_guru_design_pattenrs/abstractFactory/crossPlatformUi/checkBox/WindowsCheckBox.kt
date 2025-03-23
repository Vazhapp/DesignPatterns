package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.checkBox

class WindowsCheckBox : CheckBox {
    override fun renderCheckBox() {
        println("Rendering Windows Check Box")
    }
}