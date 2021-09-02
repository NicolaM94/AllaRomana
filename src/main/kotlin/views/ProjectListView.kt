package views

import controller.AppController
import javafx.geometry.Pos
import javafx.scene.paint.Color
import javafx.scene.text.FontWeight
import tornadofx.*


class ProjectListView :View() {

    val appController : AppController by inject()

    override val root = vbox {

        style {
            setSpacing(15.0)
            alignment = Pos.CENTER
            paddingAll = 50.0
            baseColor = Color.YELLOW
        }

        listview (appController.listOfProjects.asObservable()) {

            style {
                baseColor = Color.RED
                borderRadius += box(100.0.px)
            }

            cellFormat {
                graphic = cache {
                    form {
                        fieldset {
                            field ("Nome") {
                                style {
                                    fontWeight = FontWeight.EXTRA_BOLD
                                }
                                label(it.projectName)
                            }
                            field { for (f in appController.listOfPartecipant){ label("${f.name}") }
                        }
                    }
                    }
                }
            }
        }

        button ("Indietro") {
            style {
                baseColor = Color.web("#feb365")
                borderRadius += box(40.0.px,40.0.px)
                setPrefSize(225.0,30.0)
            }
            action {
                replaceWith<MainView>() }
        }
    }

}