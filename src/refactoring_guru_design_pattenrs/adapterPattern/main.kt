package refactoring_guru_design_pattenrs.adapterPattern

import refactoring_guru_design_pattenrs.adapterPattern.mediaPlayer.adapter.WavToMediaAdapter
import refactoring_guru_design_pattenrs.adapterPattern.mediaPlayer.legacyMediaPlayer.LegacyMediaPlayer
import refactoring_guru_design_pattenrs.adapterPattern.mediaPlayer.modernMediaPlayer.ModernMediaPlayer
import refactoring_guru_design_pattenrs.adapterPattern.shapesExample.adapter.SquarePegAdapter
import refactoring_guru_design_pattenrs.adapterPattern.shapesExample.round.RoundHole
import refactoring_guru_design_pattenrs.adapterPattern.shapesExample.round.RoundPeg
import refactoring_guru_design_pattenrs.adapterPattern.shapesExample.square.SquarePeg

fun main() {
    /*** This is Shapes example
     *     val roundHole = RoundHole(radius = 25.0)
     *     val roundPeg = RoundPeg(radius = 10.0)
     *
     *     val smallSquarePeg = SquarePeg(width = 13.0)
     *     val largeSquarePeg = SquarePeg(width = 45.0)
     *
     *     val smallSquarePegAdapter = SquarePegAdapter(squarePeg = smallSquarePeg)
     *     val largeSquarePegAdapter = SquarePegAdapter(squarePeg = largeSquarePeg)
     *
     *     println("Fit status: ${roundHole.fits(roundPeg)}")
     *
     *     if (roundHole.fits(smallSquarePegAdapter))
     *         println("Fitted Small Square Peg")
     *
     *     if (!roundHole.fits(largeSquarePegAdapter))
     *         println("Not Fitter Large Square Peg")
     */


    val legacyMediaPlayer = LegacyMediaPlayer()
    val modernMediaPlayer = ModernMediaPlayer()

    legacyMediaPlayer.playWav("qorwili")
    modernMediaPlayer.play("mp3", "qorwili")

    val adapter = WavToMediaAdapter(legacyMediaPlayer)

    adapter.play("mp3", "fulebis shovna")
}