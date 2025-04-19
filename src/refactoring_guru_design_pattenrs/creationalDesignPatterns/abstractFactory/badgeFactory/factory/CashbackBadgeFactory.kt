package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.factory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.cashbackBadge.LargeCashbackBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.cashbackBadge.MediumCashbackBadge
import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.cashbackBadge.SmallCashbackBadge

class CashbackBadgeFactory : BadgeFactory {
    override fun createSmallBadge(): Badge = SmallCashbackBadge()

    override fun createMediumBadge(): Badge = MediumCashbackBadge()

    override fun createLargeBadge(): Badge = LargeCashbackBadge()
}