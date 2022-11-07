package lms_131

fun task7(words: List<String>): Map<Int, String> {

    var result = mutableMapOf<Int, String>()


    for ((index, word) in words.withIndex()) {


        result[index] = word
    }

    return result
}

fun main() {
    println(task7(words = listOf("i", "love", "kotlin")))
}
