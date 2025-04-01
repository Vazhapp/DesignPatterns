package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.factories

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.cashback.CashbackBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.discount.DiscountBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.other.OtherBadge

interface BadgeFactory {
    fun drawCashbackBadge(): CashbackBadge
    fun drawDiscountBadge(): DiscountBadge
    fun drawOtherBadge(): OtherBadge
}