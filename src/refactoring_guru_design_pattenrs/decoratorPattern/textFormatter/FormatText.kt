package refactoring_guru_design_pattenrs.decoratorPattern.textFormatter

interface FormatText {
    fun buildString(): String

    class Prefix(
        private val prefix: String,
        private val formatText: FormatText,
    ) : FormatText {
        override fun buildString(): String = "$prefix ${formatText.buildString()}"
    }

    class Sufix(private val sufix: String) : FormatText {
        override fun buildString(): String = sufix
    }

    class Uppercase(
        private val uppercaseText: String,
        private val formatText: FormatText,
    ) : FormatText {
        override fun buildString(): String {
            return "${uppercaseText.uppercase()} ${formatText.buildString()}"
        }
    }

    class Lowercase(
        private val lowercaseText: String,
        private val formatText: FormatText,
    ) : FormatText {
        override fun buildString(): String {
            return "${lowercaseText.lowercase()} ${formatText.buildString()}"
        }
    }
}