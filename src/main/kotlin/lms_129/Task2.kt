package lms_129

fun task2(number: Int): Boolean {
    var result = true

    for (i in 2..number / 2 )

        if (number % number  == 0){
            result = false

            break

        }
    if (result)
        println("$number is prime number")
    else
        println("$number is not prime number")


    return result
}

fun main (){
    task2( number = 2)
}
//klart