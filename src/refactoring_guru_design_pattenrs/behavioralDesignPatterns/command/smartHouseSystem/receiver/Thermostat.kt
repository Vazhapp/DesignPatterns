package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.smartHouseSystem.receiver

class Thermostat {
    private var temperature = 23

    fun setTemperature(temp: Int) {
        temperature = temp
    }

    fun getTemperature() = temperature
}