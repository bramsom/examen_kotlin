package org.example

fun main() {

    println(suparPares())

}

fun suparPares() {
    val numeros = arrayOf(6, 7, 8, 9, 10, 11)
    var num = 0
    for (numero in numeros) {
        if (numero % 2 == 0) {
            num = num + numero
        } else {
            num = num
        }
    }
    print("la suma de los numeros pares es:")
    print(num)
    println()
}
