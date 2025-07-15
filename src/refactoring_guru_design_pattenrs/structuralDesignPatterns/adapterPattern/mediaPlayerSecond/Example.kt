package refactoring_guru_design_pattenrs.structuralDesignPatterns.adapterPattern.mediaPlayerSecond

// Step 1: Target interface (Modern Media Player)
interface ModernMediaPlayer {
    fun play(fileName: String, format: String): String
}

// Step 2: Legacy system (Legacy Media Player)
class LegacyMediaPlayer {
    fun playMp3(fileName: String): String {
        return "Playing MP3 file: $fileName"
    }
}

// Step 3: Adapter class
class MediaPlayerAdapter(private val legacyMediaPlayer: LegacyMediaPlayer) : ModernMediaPlayer {
    override fun play(fileName: String, format: String): String {
        return when (format.lowercase()) {
            "mp3" -> legacyMediaPlayer.playMp3(fileName)
            else -> "Unsupported format: $format. Only MP3 is supported by legacy player."
        }
    }
}

// Step 4: Modern Media Player implementation (supports multiple formats)
class AdvancedMediaPlayer : ModernMediaPlayer {
    override fun play(fileName: String, format: String): String {
        return when (format.lowercase()) {
            "mp4" -> "Playing MP4 file: $fileName"
            "wav" -> "Playing WAV file: $fileName"
            "mp3" -> "Playing MP3 file: $fileName"
            else -> "Unsupported format: $format"
        }
    }
}

// Usage example
fun main() {
    // Using the Advanced Media Player directly
    val advancedPlayer: ModernMediaPlayer = AdvancedMediaPlayer()
    println("Advanced Media Player:")
    println(advancedPlayer.play("song.mp3", "mp3"))
    println(advancedPlayer.play("video.mp4", "mp4"))
    println(advancedPlayer.play("audio.wav", "wav"))
    println(advancedPlayer.play("movie.avi", "avi"))

    println("\nLegacy Media Player with Adapter:")
    // Using the Legacy Media Player through the Adapter
    val legacyPlayer: ModernMediaPlayer = MediaPlayerAdapter(LegacyMediaPlayer())
    println(legacyPlayer.play("song.mp3", "mp3"))
    println(legacyPlayer.play("video.mp4", "mp4"))
    println(legacyPlayer.play("audio.wav", "wav"))
}