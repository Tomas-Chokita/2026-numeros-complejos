package org.example

class Complejo {
    private var reales: Int = 0
    private var imaginario: Int = 0
    override fun toString(): String{
        return "(${reales}, ${imaginario})"
    }
    fun inicializar(reales: Int, imaginario: Int) {
        this.reales=reales
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
