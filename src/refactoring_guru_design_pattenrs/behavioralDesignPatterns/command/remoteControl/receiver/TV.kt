package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.receiver

class TV {
    fun trunOn() =
        println("TV is switched ON")

    fun turnOff() =
        println("TV is switched OFF")
}