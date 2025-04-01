package refactoring_guru_design_pattenrs.creationalDesignPatterns.abstractFactory.badgesFactory.discount

class SmallDiscountBadge : DiscountBadge {
    override fun drawDiscountBadge() {
        println("Draw Small Discount badge")
    }
}