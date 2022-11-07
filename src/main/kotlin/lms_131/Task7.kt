package lms_131

fun task7(words: List<String>): Map<Int, String> {

    var result = mutableMapOf<Int, String>()


    for (word in words.withIndex()) {
        var value = word.value
        var key = word.index

        result[key]
    }

    return result
}

fun main() {
    println(task7(words = listOf("i", "love", "kotlin")))
}
