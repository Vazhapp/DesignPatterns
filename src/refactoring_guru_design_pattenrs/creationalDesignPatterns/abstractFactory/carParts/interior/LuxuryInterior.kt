package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.interior

class LuxuryInterior : Interior {
    override fun installInterior() {
        println("Installed Luxury Interior")
    }
}