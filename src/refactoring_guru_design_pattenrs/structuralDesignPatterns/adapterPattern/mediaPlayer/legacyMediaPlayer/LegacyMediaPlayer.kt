package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.mediaPlayer.legacyMediaPlayer

class LegacyMediaPlayer {
    fun playWav(fileName: String) {
        println("Playing WAV File: $fileName")
    }
}