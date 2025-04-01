package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.cashback.CashbackBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.discount.DiscountBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.factories.BadgeFactory
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.other.OtherBadge

class BadgesClient(badgeFactory: BadgeFactory) {
    private val cashbackBadge: CashbackBadge by lazy { badgeFactory.drawCashbackBadge() }
    private val discountBadge: DiscountBadge by lazy { badgeFactory.drawDiscountBadge() }
    private val otherBadge: OtherBadge by lazy { badgeFactory.drawOtherBadge() }

    fun drawCashbackBadge() {
        cashbackBadge.drawCashbackBadge()
    }

    fun drawDiscountBadge() {
        discountBadge.drawDiscountBadge()
    }

    fun drawOtherBadge() {
        otherBadge.drawOtherBadge()
    }
}