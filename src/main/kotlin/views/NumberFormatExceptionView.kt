package views
import javafx.scene.Parent
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import javafx.scene.text.FontWeight
import tornadofx.*

class NumberFormatExceptionView :View() {

    override val root = label {

        style {
            fontWeight = FontWeight.EXTRA_BOLD
            baseColor = Color.BLACK
            backgroundColor += Color.RED
        }

        this.text = "Devi inserire un valore numerico nel campo 'Numero di partecipanti!'"
    }

}