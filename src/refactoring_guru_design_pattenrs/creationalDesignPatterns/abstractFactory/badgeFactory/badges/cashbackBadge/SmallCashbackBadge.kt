package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.cashbackBadge

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge

class SmallCashbackBadge : Badge {
    override fun drawBadge() {
        println("Draw Small Cashback Badge")
    }
}