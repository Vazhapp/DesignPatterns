package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.engine

class StandardEngine : Engine {
    override fun installEngine() {
        println("Started Standard Engine")
    }
}