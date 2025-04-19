package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.cashbackBadge

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge

class MediumCashbackBadge : Badge {
    override fun drawBadge() {
        println("Draw Medium Cashback Badge")
    }
}