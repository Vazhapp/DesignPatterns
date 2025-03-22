package refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator

import refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.documentFactory.PdfDocumentFactory

fun main() {
    val pdfDocumentFactory = PdfDocumentFactory()

    val pdfDocument = pdfDocumentFactory.generateDocument()

    pdfDocument.saveDocument()
}