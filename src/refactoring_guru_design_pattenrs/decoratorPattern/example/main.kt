package refactoring_guru_design_pattenrs.decoratorPattern.example

import refactoring_guru_design_pattenrs.decoratorPattern.dressUpExample.*

interface Notifier {
    fun send(message: String)
}

class ConcreteNotifier : Notifier {
    override fun send(message: String) {
        println("Sending notification: $message")
    }
}

open class BaseDecorator(private val wrappee: Notifier) : Notifier {
    override fun send(message: String) {
        wrappee.send(message)
    }
}

class SMSDecorator(wrappee: Notifier) : BaseDecorator(wrappee) {
    override fun send(message: String) {
        super.send(message)
        sendSMS(message)
    }

    private fun sendSMS(message: String) {
        println("Sending SMS: $message")
    }
}

class FacebookDecorator(wrappee: Notifier) : BaseDecorator(wrappee) {
    override fun send(message: String) {
        super.send(message)
        sendFacebook(message)
    }

    private fun sendFacebook(message: String) {
        println("Sending Facebook message: $message")
    }
}

class SlackDecorator(wrappee: Notifier) : BaseDecorator(wrappee) {
    override fun send(message: String) {
        super.send(message)
        sendSlack(message)
    }

    private fun sendSlack(message: String) {
        println("Sending Slack message: $message")
    }
}

fun main() {
    val notifier: Notifier = ConcreteNotifier()
    val smsNotifier = SMSDecorator(notifier)
    val facebookNotifier = FacebookDecorator(smsNotifier)
    val slackNotifier = SlackDecorator(facebookNotifier)

    val sender = SMSDecorator(
        SlackDecorator(
            FacebookDecorator(
                notifier
            )
        )
    )

    val character: Character = BaseCharacter()
    val manClothing = PantsDecorator(
        ShirtDecorator(
            ShoesDecorator(
                HatDecorator(
                    character
                )
            )
        )
    )
    println(manClothing.dress())
    println(manClothing.getCost())

    val womenClothing = PantsDecorator(
        ShirtDecorator(
            JacketDecorator(
                ShoesDecorator(
                    HatDecorator(
                        character
                    )
                )
            )
        )
    )
    println(womenClothing.dress())
    println(womenClothing.getCost())
}
