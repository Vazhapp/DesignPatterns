package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.cashbackBadge

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge

class LargeCashbackBadge : Badge {
    override fun drawBadge() {
        println("Draw Large Cashback Badge")
    }
}