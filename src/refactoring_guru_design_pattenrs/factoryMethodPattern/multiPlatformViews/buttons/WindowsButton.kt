package refactoring_guru_design_pattenrs.factoryMethodPattern.multiPlatformViews.buttons

class WindowsButton : Button {
    override fun getShape() {
        println("I get a Windows Button shape")
    }
}