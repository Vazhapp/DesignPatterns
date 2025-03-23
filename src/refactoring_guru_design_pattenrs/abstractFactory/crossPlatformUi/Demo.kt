package refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi

import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories.LinuxGUIFactory
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories.MacOsGUIFactory
import refactoring_guru_design_pattenrs.abstractFactory.crossPlatformUi.factories.WindowsGUIFactory

fun main() {
    val os = "Windows"
    val windowsGuiFactory = WindowsGUIFactory()
    val macOsGuiFactory = MacOsGUIFactory()
    val linuxGuiFactory = LinuxGUIFactory()


    when(os) {
        "Windows" -> {
            windowsGuiFactory.createButton().renderButton()
            windowsGuiFactory.createCheckBox().renderCheckBox()
            windowsGuiFactory.createTextField().renderTextField()
        }
        "MacOS" -> {
            macOsGuiFactory.createButton().renderButton()
            macOsGuiFactory.createCheckBox().renderCheckBox()
            macOsGuiFactory.createTextField().renderTextField()
        }
        "Linux" -> {
            linuxGuiFactory.createButton().renderButton()
            linuxGuiFactory.createCheckBox().renderCheckBox()
            linuxGuiFactory.createTextField().renderTextField()
        }
    }
}