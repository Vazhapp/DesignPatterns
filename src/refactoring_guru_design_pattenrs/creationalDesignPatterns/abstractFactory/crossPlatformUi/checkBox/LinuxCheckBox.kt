package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.checkBox

class LinuxCheckBox : CheckBox {
    override fun renderCheckBox() {
        println("Rendering Linux Check Box")
    }
}