package refactoring_guru_design_pattenrs.abstractFactory.badgesFactory.discount

class MediumDiscountBadge : DiscountBadge {
    override fun drawDiscountBadge() {
        println("Draw Medium Discount badge")
    }
}