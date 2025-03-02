package refactoring_guru_design_pattenrs.abstractFactory.badgesFactory

import refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.factories.BigBadgeFactory

fun main() {
    val bigBadges = BadgesClient(BigBadgeFactory())

    bigBadges.drawCashbackBadge()
    bigBadges.drawDiscountBadge()
    bigBadges.drawOtherBadge()
}