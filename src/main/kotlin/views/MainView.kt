package views
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.paint.Paint
import tornadofx.*
import java.io.File
import java.net.URI


class MainView :View() {

    override val root = vbox {

        style {
            title = "AllaRomana @Nicola Moro 2021"
            setSpacing(25.0)
            backgroundImage += URI("background.png")
            alignment = Pos.CENTER_RIGHT
            setSpacing(15.0)
            paddingAll = 15.0
        }

        button ("Crea nuovo progetto") {
            style {
                focusColor = Paint.valueOf("#fe9d65")
                baseColor = Color.web("#feb365")
                setPrefSize(225.0,30.0)
            }
            action { replaceWith(NewProjectView::class) }
        }
        button ("Vedi i progetti") {
            style {
                focusColor = Paint.valueOf("#fe9d65")
                baseColor = Color.web("#feb365")
                setPrefSize(225.0,30.0)
            }
        }
        button ("Informazioni") {
            style {
                focusColor = Paint.valueOf("#fe9d65")
                baseColor = Color.web("#feb365")
                setPrefSize(225.0,30.0)
            }
        }

    }

    override fun onDock() {
        with(this.currentStage) {
            this?.width = 800.0
            this?.height = 500.0
        }
        super.onDock()
    }

}