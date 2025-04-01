package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.mediaPlayer.modernMediaPlayer

interface MediaPlayer {
    fun play(fileType: String, fileName: String)
}