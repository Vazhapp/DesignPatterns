package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.forms

class FormInput(val name: String, private val mediator: FormMediator) {
    private var value: String = ""

    init {
        mediator.registerInput(this)
    }

    fun setValue(value: String) {
        this.value = value
        mediator.notify(this)
    }

    fun isValid(): Boolean = value.isNotEmpty()
}