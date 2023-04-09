package exercise_5

fun main() {
    val listOfNumbers : List<Int> = listOf(24, 32, 17, 9, 56, -4, 99, -1, 10, -3)
    listOfNumbers.filterByTwoDigitNumbers(10).printValues()
// qui nel main mi son chiamato il metodo per filtrare e successivamete il metodo per stampare i valori ormai filtrati
// passando il parametro value
}
// ho creato due extension method
fun List<Int>.filterByTwoDigitNumbers(value : Int) : List<Int> { //il primo, di tipo List, ha come parametro value e ha il compito di filtrare la nostra lista
    return this.filter {value <= it} // qui uso il this per riferirmi al parametro che sta prima del punto negli extension method, in questo caso List
}
fun List<Int>.printValues() { //il secondo metodo mi permette di stampare i valori con un forEach
    this.forEach() {it //usando sempre la keyword this e l'iteratore
        println(it)
    }
}