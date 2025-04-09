package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.receiver

class Radio {
    fun trunOn() =
        println("Radio is switched ON")

    fun turnOff() =
        println("Radio is switched OFF")
}