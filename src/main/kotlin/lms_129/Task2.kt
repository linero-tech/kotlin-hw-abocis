package lms_129

fun task2(number: Int): Boolean {
    var result = false

    for (i in 2..number / 2 )

        if (number % 2  == 0 ){
            result = true

            break

        }
    if (!result)
        println("$number is prime number")
    else
        println("$number is not prime number")


    return result
}

fun main (){
    task2( number = 5)
}
//klart