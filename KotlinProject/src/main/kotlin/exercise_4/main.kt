package exercise_4

fun main() {
    val listOfIntegers : List<Int> = listOf(2, 3, 7) // inizializzo una lista di interi
    val listOfIntegersToString = listOfIntegers.map {it.toString() } // uso il metodo .map per applicare una conversione di tipo dalla lista di interi

    listOfIntegersToString.forEach {//qui, infine, uso un forEach per stampare ogni elemento della nuova lista convertita
        println(it)
    }
}
