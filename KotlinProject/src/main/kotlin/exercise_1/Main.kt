package exercise_1

fun main(args: Array<String>) {
    for(number in 1..101 step 2) {
        if(number <= 50) {
            firstHalfNumbers(number)
        } else {
            secondHalfNumbers(number)
        }
    }

}
fun firstHalfNumbers(number : Int) {
    println("First half numbers: $number")
}
fun secondHalfNumbers(number : Int) {
    println("Second half numbers: $number")
}