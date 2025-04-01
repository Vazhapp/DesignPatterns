package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.cashback

class MediumCashbackBadge : CashbackBadge {
    override fun drawCashbackBadge() {
        println("Draw Medium Cashback badge")
    }
}