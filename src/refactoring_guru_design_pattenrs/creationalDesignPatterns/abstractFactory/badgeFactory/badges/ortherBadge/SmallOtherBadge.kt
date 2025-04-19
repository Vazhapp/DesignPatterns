package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.ortherBadge

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge

class SmallOtherBadge : Badge {
    override fun drawBadge() {
        println("Draw Small Other Badge")
    }
}