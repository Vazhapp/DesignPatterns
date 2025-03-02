package refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.cashback

class BigCashbackBadge : CashbackBadge {
    override fun drawCashbackBadge() {
        println("Draw BIG Cashback badge")
    }
}