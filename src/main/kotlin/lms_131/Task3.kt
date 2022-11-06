package lms_131

fun task3(a: Map<Int, String>, b: Map<Int, String>): List<Int> {

    val result = mutableListOf<Int>()

    for (key in a.keys) for (key in b.keys) {

        if (key in a && key in b) {

            result.add(key)
        }

    }


    return result.distinct()
}

fun main() {
   println( task3(a = mapOf(1 to "A", 2 to "B", 3 to "C", 4 to "B"), b = mapOf(1 to "A", 2 to "B", 4 to "D")) )
}
