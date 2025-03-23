package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.checkBox

class LinuxCheckBox : CheckBox {
    override fun renderCheckBox() {
        println("Rendering Linux Check Box")
    }
}