package refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.document

class PDFDocument : Document {
    override fun saveDocument() {
        println("Saved PDF Document")
    }
}