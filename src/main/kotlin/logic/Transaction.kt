package logic

/**
 * @Transaction class managing transactions of the project
 * @property transDescription: Description of the transaction
 * @property transMovements: Array of triples containing a Partecipant, amount spent, amount payed
 * @property antiCheat: Returns true if the transaction sums to 0, false if else.
 */

class Transaction (description :String, movements :Array<Triple<Partecipant,Double,Double>>)  {

    val transDescription :String = description
    val transMovements :Array<Triple<Partecipant,Double,Double>> = movements

    fun antiCheat() :Boolean {

        var totalTransactionSpent :Double = 0.00
        var totalTransactionCost :Double = 0.00

        transMovements.forEach {
            totalTransactionCost += it.second
            totalTransactionCost += it.third
        }

        if (totalTransactionCost - totalTransactionSpent == 0.00) {
            return false
        }
        return true

    }

}