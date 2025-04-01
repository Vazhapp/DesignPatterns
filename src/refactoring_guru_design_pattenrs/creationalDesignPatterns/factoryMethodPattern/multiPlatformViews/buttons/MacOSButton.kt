package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.multiPlatformViews.buttons

class MacOSButton : Button {
    override fun getShape() {
        println("I get a MacOS Button shape")
    }
}