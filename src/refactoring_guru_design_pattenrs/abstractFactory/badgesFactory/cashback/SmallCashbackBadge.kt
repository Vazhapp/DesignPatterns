package refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.cashback

class SmallCashbackBadge : CashbackBadge {
    override fun drawCashbackBadge() {
        println("Draw Small Cashback badge")
    }
}