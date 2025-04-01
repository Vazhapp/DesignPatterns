package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.button

class MacOsButton : Button {
    override fun renderButton() {
        println("Rendering MacOS Button")
    }
}