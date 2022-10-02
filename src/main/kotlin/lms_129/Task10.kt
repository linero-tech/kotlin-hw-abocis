package lms_129

fun task10(password: String): Boolean {

    var result = true
    if (password.length < 6 ){
        result = false
    }else if (password.length > 10){
        result = false
    }else if (password.firstOrNull { it.isDigit() } == null) {
        result = false
    }else if (password.filter { it.isLetter() }.firstOrNull { it.isUpperCase() } == null) {
        result = false
    }else if (password.filter { it.isLetter() }.firstOrNull { it.isLowerCase() } == null) {
        result = false
    }
    if (password.firstOrNull { !it.isLetterOrDigit() } == null) {
        result = false
    }

    return result
}
fun main (){
    println(task10(password = "abouciS2@"))
}
