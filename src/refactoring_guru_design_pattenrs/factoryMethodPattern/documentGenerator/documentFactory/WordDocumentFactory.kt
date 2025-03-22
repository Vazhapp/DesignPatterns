package refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.documentFactory

import refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.document.Document
import refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.document.WordDocument

class WordDocumentFactory : DocumentFactory {
    override fun generateDocument(): Document = WordDocument()
}