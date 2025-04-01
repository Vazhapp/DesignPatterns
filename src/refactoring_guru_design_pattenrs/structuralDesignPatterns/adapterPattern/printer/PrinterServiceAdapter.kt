package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.printer

class PrinterServiceAdapter(
    private val legacyPrinter: LegacyPrinter
) : PrinterService {
    override fun printRichText(text: String): String {
        val plainText = text
            .replace("*", "") // Remove bold markers
            .replace("_", "") // Remove italic markers
        return legacyPrinter.printLegacyText(plainText)
    }
}