package logic

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
    val totalCost :Double = 0.00

    fun calculateDelta() :Double {
        return totalCost - totalSpent
    }


}