package refactoring_guru_design_pattenrs.bridgePattern.devices

class TV : Devices {
    private var isEnabled = false
    private var channel: Channels? = null
    private var volume = 50

    override fun isEnabled(): Boolean = isEnabled

    override fun enable() {
        isEnabled = true
    }

    override fun disable() {
        isEnabled = false
    }

    override fun getVolume(): Int = volume

    override fun setVolume(volume: Int) {
        this.volume = volume
    }

    override fun getChannel(): String {
        return channel?.name ?: "Channel not found"
    }

    override fun setChannel(channel: Channels) {
        this.channel = channel
    }

    override fun getStatus() {
        println("====================================")
        println("| 📺 I'm a TV set.")
        println("| 🔘 Status: ${if (isEnabled) "Enabled ✅" else "Disabled ❌"}")
        println("| 🔊 Volume: $volume%")
        println("| 📡 Channel: $channel")
        println("====================================\n")
    }
}