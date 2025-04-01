package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.factories

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.cashback.BigCashbackBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.cashback.CashbackBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.discount.BigDiscountBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.discount.DiscountBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.other.BigOtherBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.other.OtherBadge

class BigBadgeFactory : BadgeFactory {
    override fun drawCashbackBadge(): CashbackBadge = BigCashbackBadge()

    override fun drawDiscountBadge(): DiscountBadge = BigDiscountBadge()

    override fun drawOtherBadge(): OtherBadge = BigOtherBadge()
}