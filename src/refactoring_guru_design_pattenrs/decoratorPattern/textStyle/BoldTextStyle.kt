package refactoring_guru_design_pattenrs.decoratorPattern.textStyle

class BoldTextStyle(
    text: Text
) : TextDecorator(text) {
    override fun render(): String = "**${text.render()}**"
}