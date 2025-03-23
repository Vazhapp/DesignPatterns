package refactoring_guru_design_pattenrs.abstractFactory.carParts.factories

import refactoring_guru_design_pattenrs.abstractFactory.carParts.engine.Engine
import refactoring_guru_design_pattenrs.abstractFactory.carParts.engine.TurboEngine
import refactoring_guru_design_pattenrs.abstractFactory.carParts.interior.Interior
import refactoring_guru_design_pattenrs.abstractFactory.carParts.interior.RuggedInterior
import refactoring_guru_design_pattenrs.abstractFactory.carParts.wheels.RacingWheels
import refactoring_guru_design_pattenrs.abstractFactory.carParts.wheels.Wheel

class SportCarFactory : VehicleFactory {
    override fun installEngine(): Engine{
        return TurboEngine()
    }

    override fun installInterior(): Interior {
        return RuggedInterior()
    }

    override fun installWheel(): Wheel {
        return RacingWheels()
    }
}