package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.crossPlatformUi.button

class LinuxButton : Button {
    override fun renderButton() {
        println("Rendering Linux Button")
    }
}