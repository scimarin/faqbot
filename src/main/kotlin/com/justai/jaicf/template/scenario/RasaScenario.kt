package com.justai.jaicf.template.scenario

import com.justai.jaicf.activator.rasa.rasa
import com.justai.jaicf.model.scenario.Scenario

object RasaScenario: Scenario() {
    // each state should
    init {
        state("main") {
            activators {
                intent("moreInfo")
            }
            action {
                reactions.goBack()
            }
        }
        state("greet") {
            activators {
                intent("greet")
            }
            action {
                reactions.say("Hello! Nice to see you came to visit the booth of Just AI " +
                        "at Junction 2020! I am the Hive bot! What's your name? ")
            }
        }
        state("positions_inquiry") {
            activators {
                intent("positions_inquiry")
            }
            action {
                reactions.say("We have open positions for a developer, designer and AI expert!")
            }
        }
        state("company_inquiry") {
            activators {
                intent("company_inquiry")
            }
            action {
                reactions.say("Just AI is developing its own NLU technology and specializing in Conversational Artificial Intelligence and machine learning.; We are now proud to offer a unique full-stack conversational AI tools and technologies portfolio that addresses the needs of all kinds of audiences interested in voice tech and conversational interfaces.")
            }
        }
        state("location_inquiry") {
            activators {
                intent("location_inquiry")
            }
            action {
                reactions.say("We have offices in London, Shanghai and Saint Petersburg!")
            }
        }
        state("goodbye") {
            activators {
                intent("goodbye")
            }
            action {
                reactions.say("see you later!")
            }
        }
    }
}