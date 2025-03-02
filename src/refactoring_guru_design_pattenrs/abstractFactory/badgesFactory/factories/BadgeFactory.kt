package refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.factories

import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.cashback.CashbackBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.discount.DiscountBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.other.OtherBadge

interface BadgeFactory {
    fun drawCashbackBadge(): CashbackBadge
    fun drawDiscountBadge(): DiscountBadge
    fun drawOtherBadge(): OtherBadge
}