package lms_126

fun task5() {
    /*
    unput number from 1 to 8
    if nummer is
     1  print Monday
     2  print Tuesday
     3  print Wednesday
     4  print Thursday
     5  print Friday
     6  print Saturday
     7  print Sunday
     8  print None
     */

    // in code i would do it like this
    val dayOfTheWeek
    val result = when (dayOfTheWeek){ //here i am using the 'when' expression instead of writting many 'if' and 'else'
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        8 -> "None"
        else -> "Day Invalid"
    }
println(result)

}

