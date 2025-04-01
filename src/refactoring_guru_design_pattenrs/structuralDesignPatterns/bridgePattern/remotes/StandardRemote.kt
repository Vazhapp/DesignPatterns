package refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.remotes

import refactoring_guru_design_pattenrs.structuralDesignPatterns.bridgePattern.devices.Devices

class StandardRemote(
    private val devices: Devices
) : Remote {

    override fun powerOn() {
        println("Turn On Device")
        devices.enable()
    }

    override fun powerOff() {
        println("Turn Off Device")
        devices.disable()
    }

    override fun volumeUp() {
        println("Volume UP")
        devices.setVolume(devices.getVolume() + 10)
    }

    override fun volumeDown() {
        println("Volume Down")
        devices.setVolume(devices.getVolume() - 10)
    }

    override fun channelNext() {
        println("Next Channel")
        devices.setChannel(devices.getChannel() + 1)
    }

    override fun chanelPrevious() {
        println("Previous Channel")
        devices.setChannel(devices.getChannel() - 1)
    }
}