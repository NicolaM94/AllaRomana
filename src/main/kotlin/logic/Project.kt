package logic



class Project (name : String, partecipants : List<Partecipant>) {

    var projectName = name

    val projectPartecipants = partecipants.toMutableList()

    val transactionsList :MutableList<Transaction> = mutableListOf()




}