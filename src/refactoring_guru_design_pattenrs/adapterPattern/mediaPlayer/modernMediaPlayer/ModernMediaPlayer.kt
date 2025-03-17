package refactoring_guru_design_pattenrs.adapterPattern.mediaPlayer.modernMediaPlayer

class ModernMediaPlayer : MediaPlayer {
    override fun play(fileType: String, fileName: String) {
        when(fileType.lowercase()) {
            "wav" -> println("Playing WAV File: $fileName")
            "mp3" -> println("Playing MP3 File: $fileName")
            "aac" -> println("Playing AAC File: $fileName")
            else -> println("Unsupported Media File: $fileName")
        }
    }
}