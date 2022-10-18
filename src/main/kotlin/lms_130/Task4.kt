package lms_130

fun task4(items: List<Int>, factor: Int): List<Int> {

    var result = mutableListOf<Int>()

    for (number in items){
        if (number % factor == 0 && number !in result){
            result.add(number)
        }
    }
    return result
}

fun main (){
  println(  task4(factor = 3, items = listOf( )))
}