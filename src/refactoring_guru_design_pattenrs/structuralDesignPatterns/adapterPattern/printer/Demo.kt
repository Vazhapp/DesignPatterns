package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.printer

fun main() {
    val legacyPrinter = LegacyPrinter()
    val printerAdapter = PrinterServiceAdapter(legacyPrinter)
    val documentProcessor = DocumentProcessor(printerAdapter)

    println(documentProcessor.processAndPrint("This is a *fancy* document"))
}