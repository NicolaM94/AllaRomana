package views
import javafx.stage.Stage
import tornadofx.*

class AppEngine :App(MainView::class) {

}

fun main () {
    launch<AppEngine>()
}