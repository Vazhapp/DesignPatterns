package refactoring_guru_design_pattenrs.bridgePattern.devices

interface Devices {
    fun isEnabled(): Boolean
    fun enable()
    fun disable()
    fun getVolume(): Int
    fun setVolume(volume: Int)
    fun getChannel(): Int
    fun setChannel(channel: Int)
    fun getStatus()
}