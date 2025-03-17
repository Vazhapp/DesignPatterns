package refactoring_guru_design_pattenrs.adapterPattern.mediaPlayer.modernMediaPlayer

interface MediaPlayer {
    fun play(fileType: String, fileName: String)
}