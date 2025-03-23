package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.textField

class MacOsTextField : TextField {
    override fun renderTextField() {
        println("Renderig MacOS Text Field")
    }
}