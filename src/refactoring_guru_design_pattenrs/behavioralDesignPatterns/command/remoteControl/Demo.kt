package refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl

import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command.RadioOnCommand
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command.RadioOffCommand
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command.TvOffCommand
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.command.TvOnCommand
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.receiver.Radio
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.receiver.TV
import refactoring_guru_design_pattenrs.behavioralDesignPatterns.command.remoteControl.sender_invoker.RemoteControl

fun main() {

    // Receivers
    val tv = TV()
    val radio = Radio()
    // ****************

    // Commands
    val tvOnCommand = TvOnCommand(tv)
    val tvOffCommand = TvOffCommand(tv)

    val radioOnCommand = RadioOnCommand(radio)
    val radioOffCommand = RadioOffCommand(radio)
    // ****************

    // Sender(invoker)
    val remoteControl = RemoteControl()

    remoteControl.executeCommand(radioOffCommand)
    remoteControl.executeCommand(tvOnCommand)
    remoteControl.undoLastCommand()
}