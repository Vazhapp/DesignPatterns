package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.printer

class DocumentProcessor(private val printerService: PrinterService) {
    fun processAndPrint(document: String): String {
        println("Processing document...")
        return printerService.printRichText(document)
    }
}