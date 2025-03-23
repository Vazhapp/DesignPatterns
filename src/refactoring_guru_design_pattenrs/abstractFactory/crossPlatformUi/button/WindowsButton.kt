package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.button

class WindowsButton : Button {
    override fun renderButton() {
        println("Rendering Windows Button")
    }
}