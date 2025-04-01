package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.factories

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.engine.Engine
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.engine.StandardEngine
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.interior.Interior
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.interior.LuxuryInterior
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.wheels.AllTerrainWheels
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.wheels.Wheel

class SuvCarFactory : VehicleFactory {
    override fun installEngine(): Engine {
        return StandardEngine()
    }

    override fun installInterior(): Interior {
        return LuxuryInterior()
    }

    override fun installWheel(): Wheel {
        return AllTerrainWheels()
    }
}