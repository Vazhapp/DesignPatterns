package refactoring_guru_design_pattenrs.factoryMethodPattern.documentGenerator.document

class WordDocument : Document {
    override fun saveDocument() {
        println("Saved Word Document")
    }
}