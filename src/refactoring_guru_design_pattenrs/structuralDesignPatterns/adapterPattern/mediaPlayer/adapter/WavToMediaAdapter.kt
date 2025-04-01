package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.mediaPlayer.adapter

import refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.mediaPlayer.legacyMediaPlayer.LegacyMediaPlayer
import refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.mediaPlayer.modernMediaPlayer.MediaPlayer

class WavToMediaAdapter(private val legacyMediaPlayer: LegacyMediaPlayer) : MediaPlayer {
    override fun play(fileType: String, fileName: String) {
        if (fileType.lowercase() == "wav") {
            legacyMediaPlayer.playWav(fileName)
        } else {
            println("Converting $fileType to WAV")
            legacyMediaPlayer.playWav(fileName)
        }
    }
}