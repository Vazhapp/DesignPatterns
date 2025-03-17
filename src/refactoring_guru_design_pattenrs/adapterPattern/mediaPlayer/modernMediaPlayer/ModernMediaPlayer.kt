package refactoring_guru_design_pattenrs.adapterPattern.mediaPlayer.modernMediaPlayer

class ModernMediaPlayer : MediaPlayer {
    override fun play(fileType: String, fileName: String) {
        when(fileType.lowercase()) {
            "wav" -> println("Playing WAV File")
            "mp3" -> println("Playing MP3 File")
            "aac" -> println("Playing AAC File")
            else -> println("Unsupported Media File")
        }
    }
}