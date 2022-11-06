package lms_131

import kotlin.io.path.createTempDirectory

fun task2(mapa: Map<Int, Int>): Int {

    var result = 0

    var keys = mapa.keys

    for (key in keys) {
        result += key
    }

    return result
}
fun main (){
    println(task2(mapOf(1 to 10, 2 to 20, 3 to 30)))

}

