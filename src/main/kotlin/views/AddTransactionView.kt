package views

import controller.AppController
import javafx.beans.property.SimpleStringProperty
import javafx.scene.Parent
import tornadofx.*

class AddTransactionView :View() {

    val appController :AppController by inject()

    override fun onDock() {
        appController.listOfListeners = mutableListOf<SimpleStringProperty>()
        appController.chosenProject.projectPartecipants.forEach {
            appController.listOfListeners.add(SimpleStringProperty())
            appController.listOfListeners.add(SimpleStringProperty())
        }

        super.onDock()
    }

    override val root = form {
        appController.listOfPartecipant.forEach {
            fieldset (it.name) {
                field ("Spesa:") { textfield (it.costListener).promptText="0.00" }
                field ("Esborso:") { textfield (it.spentListener).promptText="0.00" }
            }
        }

        button ("Indietro") {
            action { close() }
        }
    }

}

//TODO: Tutto