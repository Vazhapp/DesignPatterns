package refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.factories

import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.cashback.CashbackBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.cashback.MediumCashbackBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.discount.DiscountBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.discount.MediumDiscountBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.other.MediumOtherBadge
import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.other.OtherBadge

class MediumBadgeFactory : BadgeFactory {
    override fun drawCashbackBadge(): CashbackBadge = MediumCashbackBadge()

    override fun drawDiscountBadge(): DiscountBadge = MediumDiscountBadge()

    override fun drawOtherBadge(): OtherBadge = MediumOtherBadge()
}