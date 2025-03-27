package refactoring_guru_design_pattenrs.decoratorPattern.textStyle

class PlainText(
    private val message: String
) : Text {
    override fun render(): String = message
}