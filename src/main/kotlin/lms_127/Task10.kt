package lms_127

import lms_126.task10

fun task10_1(assessments: String): Int {
    val result = assessments.count()

    println("Result is $result")

    return result


}
fun main (){
    task10_1(assessments = "LMHHF")
    task10_2(assessments ="LMFHMF" )
    task10_3(assessments ="LMFHM")
    task10_4(assessments = "LMFHM")

}


fun task10_2 (assessments: String): Char{
    val result = assessments[4]
    println("result is $result")

    return result
}





fun task10_3(assessments: String): Char {
    val indexInTheMiddle =assessments.length/2

    val result = assessments[indexInTheMiddle]
    println("result is $result")
    return result
}

fun task10_4(assessments: String): String {

    val result = assessments.substring(0,3)
    println("result is $result")

    return result
}
