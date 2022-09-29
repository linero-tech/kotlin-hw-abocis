package lms_129

fun task2(number: Int): Boolean {
    var result = true

    for (i in 2..number / 2 )

        if (number % 2  == 0){
            result = false

            break

        }
    !result
    true

    println(result)


    return result
}

fun main (){
    task2( number = 70)
}
//klart