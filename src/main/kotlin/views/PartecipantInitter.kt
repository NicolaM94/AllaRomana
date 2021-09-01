package views
import controller.AppController
import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import javafx.scene.text.FontWeight
import logic.Partecipant
import logic.Project
import tornadofx.*

class PartecipantInitter :View() {

    val appController :AppController by inject()

    override val root = vbox {

        style {
            alignment = Pos.TOP_CENTER
            paddingAll = 100
            setSpacing(10.0)
            fontWeight = FontWeight.EXTRA_BOLD }
    }

    override fun onDock() {

        //Pulisce dai children textfields creati nelle chiamate precedenti
        this.root.children.remove(0,this.root.children.size)
        //Crea i nuovi children della classe per l'istanza corrente
        label ("Inserisci in nomi dei partecipanti!")
        for (n in 1..appController.partecipants.value) {
            appController.listOfListeners.add(SimpleStringProperty())
            this.root.addChildIfPossible(textfield (appController.listOfListeners.last()) { promptText = "Partecipante n. $n"})
        }
        button ("Inserisci") {
            action {
                appController.listOfListeners.forEach {
                    appController.listOfPartecipant.add(Partecipant(it.value))
                }
                appController.listOfProjects.add(Project(appController.projectname.value,appController.listOfPartecipant))
                println(appController.listOfProjects)
                replaceWith<MainView>()
            }
        }
        button ("Annulla") { action { replaceWith<MainView>() }}
        super.onDock()
    }

}