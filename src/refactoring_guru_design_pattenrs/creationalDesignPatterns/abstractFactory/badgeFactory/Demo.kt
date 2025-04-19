package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.factory.DiscountBadgeFactory

fun main() {
    val factory = DiscountBadgeFactory()
    val badgeGenerator = BadgeGenerator(badgeFactory = factory)
    badgeGenerator.generateBadgeWithDiffSizes()

}