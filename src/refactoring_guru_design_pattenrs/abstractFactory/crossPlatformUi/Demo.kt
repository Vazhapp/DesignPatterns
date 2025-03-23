package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi

import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories.LinuxGUIFactory
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories.MacOsGUIFactory
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories.WindowsGUIFactory

fun main() {
    val windowsGuiFactory = WindowsGUIFactory()
    val macOsGuiFactory = MacOsGUIFactory()
    val linuxGuiFactory = LinuxGUIFactory()

    /**
     * Imitate the usage in the application
     */
    val app = Application(guiFactory = windowsGuiFactory)
    app.renderViews()
}