package lms_135

class Account(var balance: Double) {

    fun deposit(deposit: Double) {
        balance += deposit
    }

    fun withdrawal(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        }
    }

    fun fee(): Double {
        balance *= 0.95

        return balance
    }
}
fun main () {
    val seb = Account(100.00)

    seb.deposit(100.00)
    println(seb.balance)

    seb.deposit(100.00)
    println(seb.balance)

    seb.withdrawal(500.00)
    println(seb.balance)

    seb.fee()
    println(seb.balance)
}