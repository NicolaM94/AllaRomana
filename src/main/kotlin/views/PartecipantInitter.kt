package views
import com.sun.tools.javac.Main
import controller.AppController
import javafx.geometry.Pos
import javafx.scene.Parent
import javafx.scene.control.Button
import javafx.scene.text.FontWeight
import javafx.scene.text.Text
import tornadofx.*
import java.awt.Label
import java.awt.TextField

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
        println(this.root.children)
        this.root.children.remove(0,this.root.children.size)
        label ("Inserisci in nomi dei partecipanti!")
        for (n in 1..appController.partecipants.value) {
            this.root.addChildIfPossible(textfield { promptText = "Partecipante n. $n"})
        }
        button ("Inserisci") {  }
        button ("Annulla") { action { replaceWith<MainView>() }}
        super.onDock()
    }

}