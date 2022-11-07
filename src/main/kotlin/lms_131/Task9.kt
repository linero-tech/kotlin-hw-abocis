package lms_131

fun task9(grades: Map<String, List<Double>>): Double {
    val newGrade = grades.values
    var totalSum = 0.0
    var gradeSum = 0.0

    for (numbers in newGrade) {
        var total = 0.0
        for (number in numbers) {
            total += number
            gradeSum++
        }
        totalSum += total

    }
    val result = if (totalSum == 0.0) 0.0 else totalSum / gradeSum


    return result
}

fun main() {
    println(
        task9(
            grades = mapOf(
                "Ana" to listOf(4.0, 4.5, 5.0),
                "John" to listOf(5.0, 5.0, 3.0),
                "Lise" to listOf(5.0, 5.0, 5.0)
            )
        )
    )
}
