package refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.document

class TextDocument : Document {
    override fun saveDocument() {
        println("Saved Text Document")
    }
}