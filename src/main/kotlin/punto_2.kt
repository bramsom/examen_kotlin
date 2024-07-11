package org.example
fun main(){
    val laptop = producto("Laptop X", 1500.0)
    laptop.mostrarPrecioConIva(1500.0)
}

 class producto(nombre:String,precio:Double){

    fun mostrarPrecioConIva(precio: Double){
        var iva:Double
        iva=precio*0.16
        var valorFinal=precio+iva

        println("el valoro del producto con iva es de $valorFinal")

    }
}

