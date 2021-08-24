package views
import javafx.beans.property.IntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.beans.value.ObservableIntegerValue
import javafx.scene.Parent
import javafx.scene.paint.Paint
import tornadofx.*
import java.awt.Color

class NewProjectView :View() {

    val projectName = SimpleStringProperty()
    var numberOfPartecipant = observableIntArrayOf()

    override val root = vbox {
        hbox {
            textfield (projectName) { promptText="Nome del progetto" }
            textfield () { textProperty().addListener { obs,old,new ->
                if (!new.isInt()) this.style {
                    focusColor = Paint.valueOf("#ff0000")
                }
                }
            }
        }
    }

}