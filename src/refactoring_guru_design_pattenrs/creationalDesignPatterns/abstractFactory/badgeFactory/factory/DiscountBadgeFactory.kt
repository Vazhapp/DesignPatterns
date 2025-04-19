package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.factory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.discountBadge.LargeDiscountBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.discountBadge.MediumDiscountBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.discountBadge.SmallDiscountBadge

class DiscountBadgeFactory : BadgeFactory {
    override fun createSmallBadge(): Badge = SmallDiscountBadge()

    override fun createMediumBadge(): Badge = MediumDiscountBadge()

    override fun createLargeBadge(): Badge = LargeDiscountBadge()
}