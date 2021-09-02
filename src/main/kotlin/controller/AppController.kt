package controller
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.beans.value.ObservableStringValue
import logic.Partecipant
import logic.Project
import tornadofx.*

class AppController :Controller() {

    //Settings del nuovo progetto avviato
    val projectname = SimpleStringProperty("Nuovo")
    val partecipants = SimpleIntegerProperty().asObject()

    var listOfPartecipant = mutableListOf<Partecipant>()

    /**Questo raccoglie i text values dei textfield creati dinamicamente in fase di docking della View */
    val listOfListeners : MutableList<SimpleStringProperty> = mutableListOf()

    /**Questo raccoglie i progetti correnti*/
    val listOfProjects : MutableList<Project> = mutableListOf()

    var chosenProject = Project("null", listOf(Partecipant("null")))

}