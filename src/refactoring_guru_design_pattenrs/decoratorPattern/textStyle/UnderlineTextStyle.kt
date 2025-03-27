package refactoring_guru_design_pattenrs.decoratorPattern.textStyle

class UnderlineTextStyle(
    text: Text
) : TextDecorator(text) {
    override fun render(): String = "__${text.render()}__"
}