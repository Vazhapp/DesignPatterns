package refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.devices

class Radio : Devices {
    private var isEnabled = false
    private var channel = 0
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

    override fun getChannel(): Int = channel

    override fun setChannel(channel: Int) {
        this.channel = channel
    }

    override fun getStatus() {
        println("====================================")
        println("| 📺 I'm a Radio set.")
        println("| 🔘 Status: ${if (isEnabled) "Enabled ✅" else "Disabled ❌"}")
        println("| 🔊 Volume: $volume%")
        println("| 📡 Channel: $channel")
        println("====================================\n")
    }
}