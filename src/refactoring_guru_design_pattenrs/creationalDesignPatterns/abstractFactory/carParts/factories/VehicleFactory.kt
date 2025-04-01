package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.factories

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.engine.Engine
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.interior.Interior
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.carParts.wheels.Wheel

interface VehicleFactory {
    fun installEngine(): Engine
    fun installInterior(): Interior
    fun installWheel(): Wheel
}