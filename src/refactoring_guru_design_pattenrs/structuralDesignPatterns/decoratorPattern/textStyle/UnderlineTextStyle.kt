package refactoring_guru_design_pattenrs.structuralDesignPatterns.decoratorPattern.textStyle

class UnderlineTextStyle(
    text: Text
) : TextDecorator(text) {
    override fun render(): String = "__${text.render()}__"
}