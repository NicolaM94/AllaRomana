package views
import javafx.stage.Stage
import tornadofx.*

class AppEngine :App(MainView::class) {

    override fun start(stage: Stage) {
        with(stage) {
            this.isResizable = false
            this.width = 800.0
            this.height = 500.0
        }
        super.start(stage)
    }

}

fun main () {
    launch<AppEngine>()
}