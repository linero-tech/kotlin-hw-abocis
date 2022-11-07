package lms_131

fun task8(grades: Map<String, List<Double>>): String {

    var result = ""
    val total = mutableMapOf<String, Double>()


    for (entry in grades) {
        val grade = entry.value
        var maxGrade = 0.0
        for (number in grade) {
            maxGrade += number
        }
        total[entry.key] = maxGrade / grade.size
    }
    var maxValue = 0.0
    for ((key, value) in total.entries) {
        if (value > maxValue) {
            maxValue = value
            result = key

        }

    }




    return result
}

fun main() {
    println(
        task8(
            mapOf(
                "Ana" to listOf(4.0, 4.5, 5.0),
                "John" to listOf(5.0, 5.0, 3.0),
                "Lise" to listOf(5.0, 5.0, 5.0)
            )
        )
    )
}
