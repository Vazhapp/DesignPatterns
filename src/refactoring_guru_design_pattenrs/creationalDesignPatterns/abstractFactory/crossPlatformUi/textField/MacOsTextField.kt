package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.textField

class MacOsTextField : TextField {
    override fun renderTextField() {
        println("Rendering MacOS Text Field")
    }
}