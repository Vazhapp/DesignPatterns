package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.factory.BadgeFactory

class BadgeGenerator(private val badgeFactory: BadgeFactory) {
    fun generateBadgeWithDiffSizes() {
        badgeFactory.createSmallBadge().drawBadge()
        badgeFactory.createMediumBadge().drawBadge()
        badgeFactory.createLargeBadge().drawBadge()
    }
}