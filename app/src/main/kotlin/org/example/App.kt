package org.example

class Complejo {
    private var real: Int = 0
    private var imaginario: Int = 0
    override fun toString(): String{
        return "(${real}, ${imaginario})"
    }
    fun inicializar(real: Int, imaginario: Int) {
        this.real=real
        this.imaginario=imaginario
    }
}
fun main() {
    var c1:Complejo=Complejo()
    var c2:Complejo=Complejo()
    c1.inicializar(1,2)
    c2.inicializar(3,4)
    var c3: Complejo = Complejo()
    println(c3.toString())
}
