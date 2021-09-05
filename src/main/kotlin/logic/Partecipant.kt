package logic

import javafx.beans.property.SimpleStringProperty

/**
 * Classe Partecipant, crea un pratecipante per un progetto
 * @property name: nome del partecipante
 * @property totalSpent: esborso totale del partecipante
 * @property totalCost: spesa totale del partecipante
 * @fun calculateDelta: delta tra spesa e costo. Se positivo il partecipant è creditore, debitore altrimenti.
 */

class Partecipant (name:String) {

    val name :String = name
    var totalSpent :Double = 0.00
    var totalCost :Double = 0.00

    /**
     * Listener utilizzati nella clase AddTransactionView, tengono traccia delle aggiunte di spesa.
     */
    val costListener = SimpleStringProperty()
    val spentListener = SimpleStringProperty()


    fun calculateDelta() :Double {
        return totalSpent - totalCost
    }

    fun refreshCostsAndSpents() {
        totalCost += costListener.value.toDouble()
        totalSpent += spentListener.value.toDouble()
    }


}