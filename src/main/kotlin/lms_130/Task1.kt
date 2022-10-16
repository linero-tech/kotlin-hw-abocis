package lms_130

fun task1(items: List<Int>): Int {



    var result = if (items.isEmpty()){
        0
    }else {
        items.random()
    }


    return result
}

fun main (){
    println(task1(items = listOf(1,2,3,4) ))
}
