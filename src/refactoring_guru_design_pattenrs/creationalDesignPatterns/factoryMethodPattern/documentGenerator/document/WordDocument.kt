package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.documentGenerator.document

class WordDocument : Document {
    override fun saveDocument() {
        println("Saved Word Document")
    }
}