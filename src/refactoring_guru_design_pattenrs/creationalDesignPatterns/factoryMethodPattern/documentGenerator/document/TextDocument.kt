package refactoring_guru_design_pattenrs.creationalDesignPatterns.factoryMethodPattern.documentGenerator.document

class TextDocument : Document {
    override fun saveDocument() {
        println("Saved Text Document")
    }
}