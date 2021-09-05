package views

import controller.AppController
import javafx.scene.Parent
import tornadofx.*

class AddTransactionView :View() {

    val appController :AppController by inject()

    override val root = form {
        fieldset ("Nuova spesa!") {
            for (partecipant in appController.chosenProject.projectPartecipants) {
                field {  }
            }
        }
    }

}

//TODO: Tutto