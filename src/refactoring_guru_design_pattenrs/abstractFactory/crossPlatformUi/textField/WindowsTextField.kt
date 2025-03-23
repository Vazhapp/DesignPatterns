package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.textField

class WindowsTextField : TextField {
    override fun renderTextField() {
        println("Rendering Windows Text Field")
    }
}