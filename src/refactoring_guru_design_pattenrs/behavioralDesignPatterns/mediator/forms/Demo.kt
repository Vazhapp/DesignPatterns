package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.forms

fun main() {
    val mediator = FormMediator()

    val usernameInput = FormInput("Username", mediator)
    val passwordInput = FormInput("Password", mediator)

    usernameInput.setValue("John")
    passwordInput.setValue("<PASSWORD>")
}