package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.textField

class LinuxTextField : TextField {
    override fun renderTextField() {
        println("Rendering Linux Text Field")
    }
}