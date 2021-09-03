package logic



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




}