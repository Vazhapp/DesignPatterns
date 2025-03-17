package refactoring_guru_design_pattenrs.adapterPattern

import refactoring_guru_design_pattenrs.adapterPattern.powerPlugs.EuFridge
import refactoring_guru_design_pattenrs.adapterPattern.powerPlugs.UsToEuPowerAdapter
import refactoring_guru_design_pattenrs.adapterPattern.powerPlugs.euPowerPlug.EUPowerPlug
import refactoring_guru_design_pattenrs.adapterPattern.powerPlugs.usPowerPlug.USPowerPlug

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


    /** This is MediaPlayer example
     *     val legacyMediaPlayer = LegacyMediaPlayer()
     *     val modernMediaPlayer = ModernMediaPlayer()
     *
     *     legacyMediaPlayer.playWav("qorwili")
     *     modernMediaPlayer.play("mp3", "qorwili")
     *
     *     val adapter = WavToMediaAdapter(legacyMediaPlayer)
     *
     *     adapter.play("mp3", "fulebis shovna")
     */

    val usPowerPlug = USPowerPlug()
    val euPowerPlug = EUPowerPlug()

    val euFridge = EuFridge(euPowerPlug)

    val usToEuPowerAdapter = UsToEuPowerAdapter(usPowerPlug = usPowerPlug)

    val secondEuFridge = EuFridge(usToEuPowerAdapter)

    secondEuFridge.startWorking()
}