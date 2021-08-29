package views
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import javafx.scene.text.FontWeight
import tornadofx.*

class InfoView :View() {

    override val root = vbox {

        style {
            alignment = Pos.CENTER
            setSpacing(10.0)
            fontWeight = FontWeight.EXTRA_BOLD
        }

        label ("AllaRomana App")
        label ("Author: Nicola Moro, 2021")
        label ("Distributed under GPL license")
        label ("See Github page @ https://github.com/NicolaM94/AllaRomana")

        button ("Indietro") {
            style {
                focusColor = Paint.valueOf("#ff6700")
                baseColor = Color.LIGHTCORAL
            }
            action { replaceWith<MainView>() }
        }
    }
}