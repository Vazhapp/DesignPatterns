package refactoring_guru_design_pattenrs.adapterPattern.printer

interface PrinterService {
    fun printRichText(text: String): String
}