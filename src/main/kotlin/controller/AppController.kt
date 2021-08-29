package controller
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.beans.value.ObservableStringValue
import tornadofx.*

class AppController :Controller() {

    //Settings del nuovo progetto avviato
    val projectname = SimpleStringProperty("Nuovo")
    val partecipants = SimpleIntegerProperty().asObject()


}