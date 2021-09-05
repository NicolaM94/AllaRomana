package views

import controller.AppController
import javafx.geometry.Pos
import javafx.scene.Parent
import javafx.scene.text.FontWeight
import tornadofx.*
import java.net.URI

class ProjectView :View() {

    override val root = hbox {

        val appController = find<AppController> {  }

        style {
            backgroundImage += URI("logobg.png")
        }

        form {
            fieldset (appController.chosenProject.projectName) {
                separator()
                separator()
                for (f in appController.chosenProject.projectPartecipants) {
                    field ("${f.name}:"){
                        style {
                            fontWeight = FontWeight.EXTRA_BOLD
                        }
                        field("Spesa totale =") {label(f.totalCost.toString()).style{fontWeight = FontWeight.BOLD}}
                        field("Esborso totale =") {label(f.totalSpent.toString()).style{fontWeight = FontWeight.BOLD}}
                    }
                }
                separator()
                fieldset ("Totali") {
                    field ("Spesa totale: ") {  }
                    field ("Esborso totale: ") { }
                }
                separator()
                fieldset ("Ecco come fare: ") {  }
            }
        }

        vbox () {
            style {
                paddingAll = 15.0
                setSpacing(10.0)
                setAlignment(Pos.TOP_RIGHT)
            }
            button ("Aggiungi movimento") {
                style { setPrefSize(225.0,30.0) }
                action {openInternalWindow<>()}

            }
            button ("Distruggi progetto") {
                style { setPrefSize(225.0,30.0) }
            }
            button ("Indietro") {
                style { setPrefSize(225.0,30.0) }
                action {replaceWith<ProjectListView>()}
            }
        }

    }

}