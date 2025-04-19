package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.factory

import refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgeFactory.badges.Badge

interface BadgeFactory {
    fun createSmallBadge(): Badge
    fun createMediumBadge(): Badge
    fun createLargeBadge(): Badge
}