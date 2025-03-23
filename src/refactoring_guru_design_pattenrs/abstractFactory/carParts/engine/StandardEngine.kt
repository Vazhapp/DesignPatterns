package refactoring_guru_design_pattenrs.abstractFactory.carParts.engine

class StandardEngine : Engine {
    override fun installEngine() {
        println("Started Standard Engine")
    }
}