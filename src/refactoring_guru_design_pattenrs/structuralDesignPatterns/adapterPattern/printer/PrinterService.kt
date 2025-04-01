package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.printer

interface PrinterService {
    fun printRichText(text: String): String
}