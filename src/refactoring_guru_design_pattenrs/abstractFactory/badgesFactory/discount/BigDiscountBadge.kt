package refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.discount

class BigDiscountBadge : DiscountBadge {
    override fun drawDiscountBadge() {
        println("Draw BIG Discount badge")
    }
}