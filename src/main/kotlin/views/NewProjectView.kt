package views
import controller.AppController
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import popups.NumberFormatExceptionView
import tornadofx.*

class NewProjectView :View() {

    val appController : AppController by inject()
    val projectName = SimpleStringProperty()
    val projectPartecipants = SimpleStringProperty()


    override val root = vbox {

        style {
            alignment = Pos.CENTER
            setSpacing(10.0)
            paddingAll = 150.0
        }

        textfield (projectName){ promptText = "Nome del progetto"  }
        textfield (projectPartecipants) { promptText = "Numero di partecipanti" }
        button ("Avvia progetto!") {

            action {
                try {
                    projectPartecipants.value.toInt()
                    appController.projectname.set(projectName.value)
                    appController.partecipants.set(projectPartecipants.value.toInt())
                    replaceWith<PartecipantInitter>()
                } catch (exception:NumberFormatException) {
                    openInternalWindow<NumberFormatExceptionView>()
                }
            }
        }
        button ("Annulla") { action { replaceWith<MainView>() }}

    }

}