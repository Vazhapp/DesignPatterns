package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.factories

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.cashback.CashbackBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.cashback.SmallCashbackBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.discount.DiscountBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.discount.SmallDiscountBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.other.OtherBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.other.SmallOtherBadge

class SmallBadgeFactory : BadgeFactory {
    override fun drawCashbackBadge(): CashbackBadge = SmallCashbackBadge()

    override fun drawDiscountBadge(): DiscountBadge = SmallDiscountBadge()

    override fun drawOtherBadge(): OtherBadge = SmallOtherBadge()
}