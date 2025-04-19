package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.discountBadge

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge

class SmallDiscountBadge : Badge {
    override fun drawBadge() {
        println("Draw Small Discount Badge")
    }
}