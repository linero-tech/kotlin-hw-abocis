package lms_127

fun task9(sentence: String, character: Char): Boolean {

    val result = sentence.contains(character, ignoreCase = true)
     val sentence = "I code in KOTLIN"

    println("result is $result")

return result

}
fun main (){
    task9(sentence = "I code I KOTLIN", character = 'i')



}
//klart!!
