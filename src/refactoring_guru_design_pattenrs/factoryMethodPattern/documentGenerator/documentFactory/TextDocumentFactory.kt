package refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.documentFactory

import refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.document.Document
import refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.document.TextDocument

class TextDocumentFactory : DocumentFactory {
    override fun generateDocument(): Document = TextDocument()
}