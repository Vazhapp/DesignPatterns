package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.discountBadge

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge

class MediumDiscountBadge : Badge {
    override fun drawBadge() {
        println("Draw Medium Discount Badge")
    }
}