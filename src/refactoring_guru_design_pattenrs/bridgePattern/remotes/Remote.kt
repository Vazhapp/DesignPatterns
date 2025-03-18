package refactoring_guru_design_pattenrs.bridgePattern.remotes

interface Remote {
    fun powerOn()
    fun powerOff()
    fun volumeUp()
    fun volumeDown()
    fun channelNext()
    fun chanelPrevious()
}