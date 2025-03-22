package refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.documentFactory

import refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.document.Document

interface DocumentFactory {
    fun generateDocument(): Document
}