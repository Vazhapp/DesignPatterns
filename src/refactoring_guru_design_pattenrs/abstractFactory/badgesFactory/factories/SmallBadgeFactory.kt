package refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.factories

import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.cashback.CashbackBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.cashback.SmallCashbackBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.discount.DiscountBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.discount.SmallDiscountBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.other.OtherBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.other.SmallOtherBadge

class SmallBadgeFactory : BadgeFactory {
    override fun drawCashbackBadge(): CashbackBadge = SmallCashbackBadge()

    override fun drawDiscountBadge(): DiscountBadge = SmallDiscountBadge()

    override fun drawOtherBadge(): OtherBadge = SmallOtherBadge()
}