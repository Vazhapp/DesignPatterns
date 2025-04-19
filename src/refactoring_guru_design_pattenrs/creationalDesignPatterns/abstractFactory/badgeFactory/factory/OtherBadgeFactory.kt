package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.factory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.ortherBadge.LargeOtherBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.ortherBadge.MediumOtherBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.ortherBadge.SmallOtherBadge

class OtherBadgeFactory : BadgeFactory {
    override fun createSmallBadge(): Badge = SmallOtherBadge()

    override fun createMediumBadge(): Badge = MediumOtherBadge()

    override fun createLargeBadge(): Badge = LargeOtherBadge()
}