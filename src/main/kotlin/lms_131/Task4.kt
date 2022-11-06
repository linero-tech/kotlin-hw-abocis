package lms_131

fun task4(mapa: Map<Int, Int>, value: Int): List<Int> {

    val result = mutableListOf<Int>()

    for(entry in mapa){
        if (entry.value == value){

            result.add(entry.key)
        }

    }


    return result
}
fun main (){
    task4(mapa = mapOf(1 to 100, 2 to 100, 3 to 200), (100))
}