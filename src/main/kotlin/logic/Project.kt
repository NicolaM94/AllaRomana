package logic

import javafx.beans.property.ObjectProperty
import javafx.beans.property.SimpleStringProperty


class Project (name : String, partecipants : List<Partecipant>) {

    var projectName = name

    val projectPartecipants = partecipants.toMutableList()

    val transactionsList :MutableList<Transaction> = mutableListOf()

    fun totalCost() :Double {
        var result = 0.0
        projectPartecipants.forEach {
            result += it.totalCost
        }
        return result
    }

    fun totalSpent() :Double {
        var result = 0.0
        projectPartecipants.forEach {
            result += it.totalSpent
        }
        return result
    }

    fun calculator () {
        val results :MutableList<String> = mutableListOf()
        val creditors :MutableList<Partecipant> = mutableListOf()
        val debitors :MutableList<Partecipant> = mutableListOf()

        for (partecipant in projectPartecipants) {
            if (partecipant.calculateDelta() > 0) {
                creditors.add(partecipant)
            } else if (partecipant.calculateDelta() < 0) {
                debitors.add(partecipant)
            }
        }

        for (creditor in creditors) {
            for (debitor in debitors) {
                if (creditor.calculateDelta() > debitor.calculateDelta()) {
                    results.add("$debitor deve ridare ${debitor.calculateDelta()} a $creditor")
                    debitors.remove(debitor)
                }
                else if (creditor.calculateDelta() == debitor.calculateDelta()) {
                    results.add("$debitor deve ridare ${debitor.calculateDelta()} a $creditor")
                    debitors.remove(debitor)
                    creditors.remove(creditor)
                }
                else if (creditor.calculateDelta() < debitor.calculateDelta()) {
                    results.add("$debitor deve ridare ${debitor.calculateDelta()} a $creditor")
                    creditors.remove(creditor)
                }
            }
        }
    }



}