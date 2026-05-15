package org.example

class Complejo(private var real: Double=0.0, private var imaginario: Double=0.0){
    fun inicializar(real:Double,imaginario:Double){
        this.real=real
        this.imaginario=imaginario
    }
    fun mostrar(){
        println("this.toString()")
    }
    override fun toString():String{
        return "(${real},${imaginario})"
    }
    fun sumar(otro: Complejo): Complejo {
        return Complejo(
            real+otro.real,
            imaginario+otro.imaginario
        )
    }
    fun restar(otro: Complejo): Complejo {
        return Complejo(
            real-otro.real,
            imaginario-otro.imaginario
        )
    }
    fun multiplicar(otro: Complejo): Complejo{
        val nuevoReal=(this.real*otro.real)-(this.imaginario*otro.imaginario)
        val nuevoImaginario=(this.real*otro.imaginario)+(this.imaginario*otro.real)
        return Complejo(nuevoReal, nuevoImaginario)
    }
    fun dividir(otro: Complejo): Complejo{
        val denominador=(otro.real*otro.real)+(otro.imaginario*otro.imaginario)
        val nuevoReal=(this.real*otro.real+this.imaginario*otro.imaginario)/denominador 
        val nuevoImaginario=(this.imaginario*otro.real-this.real*otro.imaginario)/denominador 
        return Complejo(nuevoReal, nuevoImaginario)
    }
}

fun main() {
    var complejo:Complejo
    complejo=Complejo()
    complejo.inicializar(3.0,4.0)
    println("Mi primer número complejo es $complejo")
    var c2:Complejo=Complejo(1.0,2.0)
    println("Mi segundo número complejo es $c2")
    var c3=complejo.sumar(c2)
    println("Mi suma de números complejos es $c3")
    var c4=complejo.restar(c2)
    println("Mi resta de números complejos es $c4")
    val c5=complejo.multiplicar(c2)
    println("Mi multiplicación de números complejos es $c5")
    val c6=complejo.dividir(c2)
    println("Mi divisón de números complejos es $c6")
}