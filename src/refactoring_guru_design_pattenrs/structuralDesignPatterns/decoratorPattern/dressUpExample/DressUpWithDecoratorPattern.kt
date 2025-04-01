package refactoring_guru_design_pattenrs.structuralDesignPatterns.decoratorPattern.dressUpExample

interface Character {
    fun dress(): String
    fun getCost(): Int
}

class BaseCharacter: Character {
    override fun dress(): String = "Underwear"

    override fun getCost(): Int = 5
}

abstract class ClothingDecorator(private val character: Character) : Character {
    override fun dress(): String =
        character.dress()

    override fun getCost(): Int =
        character.getCost()
}

class ShirtDecorator(character: Character) : ClothingDecorator(character) {
    override fun dress(): String {
        return "${super.dress()}, ${Wardrobe.T_SHIRT}"
    }

    override fun getCost(): Int {
        return super.getCost() + 15
    }
}

class PantsDecorator(character: Character) : ClothingDecorator(character) {
    override fun dress(): String {
        return "${super.dress()}, ${Wardrobe.JEANS}"
    }

    override fun getCost(): Int {
        return super.getCost() + 75
    }
}

class JacketDecorator(character: Character) : ClothingDecorator(character) {
    override fun dress(): String {
        return "${super.dress()}, ${Wardrobe.JACKET}"
    }

    override fun getCost(): Int {
        return super.getCost() + 120
    }
}

class HatDecorator(character: Character) : ClothingDecorator(character) {
    override fun dress(): String {
        return "${super.dress()}, ${Wardrobe.CAP}"
    }

    override fun getCost(): Int {
        return super.getCost() + 55
    }
}

class ShoesDecorator(character: Character) : ClothingDecorator(character) {
    override fun dress(): String {
        return "${super.dress()}, ${Wardrobe.SANDALS}"
    }

    override fun getCost(): Int {
        return super.getCost() + 35
    }
}