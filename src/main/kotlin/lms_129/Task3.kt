package lms_129

fun task3(number: Int): Int {
    var result = 1

    for(i in 2..number) {
        result *= i
    }
    return result
}
fun main(){
    println( task3(number=5))
}

// klart!!