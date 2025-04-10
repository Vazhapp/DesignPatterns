package refactoring_guru_design_pattenrs.behavioralDesignPatterns.mediator.forms

class FormMediator {
    private val inputs = mutableListOf<FormInput>()
    private var submitButtonEnabled = false

    fun registerInput(input: FormInput) {
        inputs.add(input)
    }

    fun notify(formInput: FormInput) {
        submitButtonEnabled = inputs.all { it.isValid() }
        println("Submit button enabled: $submitButtonEnabled")
    }
}